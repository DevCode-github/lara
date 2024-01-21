import { Component } from '@angular/core';
import {FormGroup, FormBuilder, FormControl, Validators, FormArray, Form} from '@angular/forms'
import {AdminServiceService} from '../admin-service.service';
import { CookieService } from 'ngx-cookie-service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent {
  signupForm : FormGroup;
  data :any;
  msg = false;
  constructor (private formBuilder :FormBuilder, private adminService: AdminServiceService){
    this.signupForm = formBuilder.group({
      firstName: new FormControl('', Validators.required),
      lastName: new  FormControl('',Validators.required),
      email: new FormControl('',Validators.required),
      password: new FormControl('', Validators.required),
    })
    
  }

  signup(){
    console.log(this.signupForm.value)
    this.adminService.signup(this.signupForm.value).subscribe(
      r1 => {
        console.log(r1)
        this.data = r1.valueOf();
        if (this.data['status']) this.msg = true;
      })
    }
}
