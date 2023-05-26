import { Component } from '@angular/core';
import {FormBuilder, FormGroup, FormControl, Validators} from '@angular/forms'

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})

export class LoginComponent {
  //fields
  //formgroup field
  loginForm: FormGroup;
  //field for ngModel
  firstName = "";
  //field for ngModel
  password = "";

  validateName = false;
  validatePassword = false;
  //field for final validation
  validateForm = false;
  //field to check session storage is empty or not
  signupWarning = false;

  constructor (formBuilder: FormBuilder){
    this.loginForm = formBuilder.group({
      firstName: new FormControl('',[Validators.required]),
      password: new FormControl('',[Validators.required])
    })
  }

  validate() {
    //if session storage is empty do not validate and return the control
    if (sessionStorage.getItem('firstName') == null || sessionStorage.getItem('password') == null) {
      this.signupWarning = true;
      return;
    }

    //validation for Name
    if (this.loginForm.get('firstName')?.value != sessionStorage.getItem('firstName')) {
      this.firstName = "";
      this.validateName = true;
    }
    else {
      this.validateName = false;
    }

    //validation for password
    if (this.loginForm.get('password')?.value != sessionStorage.getItem('password')) {
      this.validatePassword = true;
      this.password = "";
    }
    else {
      this.validatePassword = false;
    }

    //confirming validation for submission, validateForm is used to check for final validation
    this.validateForm = !this.validateName && !this.validatePassword;
  }

  //getters
  get name(){
    return this.loginForm.get('firstName')
  }
  get pass(){
    return this.loginForm.get('password')
  }

}
