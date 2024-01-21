import { Component, EventEmitter, Output } from '@angular/core';
import { FormArray, FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { AdminServiceService } from '../admin-service.service';
import { CookieService } from 'ngx-cookie-service';
import { catchError, pipe, throwError } from 'rxjs';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent {
  @Output() loggedIn = new EventEmitter<boolean>();

  detail :FormGroup;
  data :any;
  msg = false;
  content = ""
  sendData: any;

  ngOnInit(){
    this.loggedIn.emit(true);
    this.adminService.fetch(this.getFormData()).subscribe(
      data => {
        this.data = data.valueOf();
        this.detail.get('firstName')?.setValue(this.data['firstName'])
        this.detail.get('lastName')?.setValue(this.data['lastName'])
        this.detail.get('email')?.setValue(this.data['email'])
      }
    )
  }

  constructor(private formBuilder :FormBuilder, private adminService :AdminServiceService, private cookieService :CookieService){
    
    this.detail = formBuilder.group({
      firstName: new FormControl('', Validators.required),
      lastName: new  FormControl('',Validators.required),
      email: new FormControl('',Validators.required),
      address: formBuilder.group({
        street: new FormControl('',Validators.required),
        house: new FormControl('',Validators.required),
      }),
      bookLists : new FormArray([
        formBuilder.group({
          bookName: new FormControl('',Validators.required)
        })
      ]),
      courses : new FormArray([
        formBuilder.group({
          id : new FormControl('',Validators.required),
          courseName : new FormControl('',Validators.required)
        })
      ])
    })
    this.adminService.hidden = true;
  }

  get bookList(){
    return this.detail.get('bookList') as FormArray;
  }
  get courses(){
    return this.detail.get('courses') as FormArray;
  }

  addBook(e :any){
    this.bookList.push(this.formBuilder.group({
    bookName: new FormControl('',Validators.required)
    }))
  e.preventDefault();
  }
  
  removeBook(e :any){
    if (this.bookList.controls.length > 1)  this.bookList.controls.pop();
    e.preventDefault();
  }


  addCourse(e :any){
    this.courses.push(this.formBuilder.group({
      id : new FormControl('',Validators.required),
      courseName : new FormControl('',Validators.required)
    }))
    e.preventDefault();
  }

  getFormData(): FormData{
    const formData = new FormData();
    formData.append("id",this.cookieService.get('token'))
    return formData;
  }

  submit(){
    const arr :any = []
    this.courses.controls.forEach((obj) => {
      arr.push(obj.get('id')?.value)
    })
    if (this.courses.controls.length == 1 && this.courses.controls[0].get('id')?.value === "") {
      this.sendData = new FormData();
      this.sendData.append('appUser', this.detail.value)
    }
    if (new Set(arr).size != arr.length) {
      this.msg = true;
      this.content = "course id should be unique";
      return;
    }
    console.log(this.detail.value)
    this.adminService.update(this.detail.value).pipe(
      catchError((error)=>{
        this.msg=true;
        this.content="error"
        return throwError(()=> new Error(error))
      })
    ).subscribe(
      stat =>{
         let data: any = stat.valueOf();
        if (data['status']) {
          this.msg = true
          this.content = "updated!"
          this.cookieService.set('uuid', data['id'])
        }
        else this.msg=false
      }
    )
  }
}
