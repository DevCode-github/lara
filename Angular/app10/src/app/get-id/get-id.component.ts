import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { AdminServiceService } from '../admin-service.service';
import { catchError, throwError } from 'rxjs';

@Component({
  selector: 'app-get-id',
  templateUrl: './get-id.component.html',
  styleUrls: ['./get-id.component.css']
})
export class GetIdComponent {
  msg = false;
  getIdForm :FormGroup;
  data :any;
  noSuchId = false;
  sending = false;
  error = "";
  constructor(formBuilder :FormBuilder, private adminService:AdminServiceService){
    this.getIdForm = formBuilder.group({
      email : new FormControl('',Validators.required)
    })
  }
  getId = new FormControl('',Validators.required);

  submit(){
    this.noSuchId = false;
    this.sending = true;
    this.msg = false;
    this.error = "";

      this.adminService.forgot(this.getIdForm.value).pipe(
        catchError((error)  => {
          this.sending = false
          this.error = "connection refused"
          return throwError(error)
        })
      ).subscribe(
        stat => {
          this.data = stat.valueOf();
          console.log(this.data)
          if(this.data['status']) {
            this.msg = true;
            this.sending = false;
          }
          else {
            this.noSuchId = true;
            this.sending = false;
          }
        }
      )
  }
}
