import { Component,EventEmitter, Output } from '@angular/core';
import {FormBuilder, FormGroup, FormControl, Validators} from '@angular/forms'
import { SignUpComponent } from '../sign-up/sign-up.component';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})

export class LoginComponent {
  //fields
  //Output decorator to transmit show signup form upon successfull login
  //it raise an event to notify the parent of the change, which is of the type Eventemitter.
  @Output() signupShowEvent = new EventEmitter<boolean>();

  //formgroup field
  loginForm: FormGroup;
  
  //field for ngModel
  userName = "";
  
  //field for ngModel
  password = "";
  
  //field to confirm formcontrol validatoin
  validateName = false;
  validatePassword = false;

  //field for final validation
  validateForm = false;
  
  //field to check session storage is empty or not
  signupWarning = false;

  constructor (formBuilder: FormBuilder){
    this.loginForm = formBuilder.group({
      userName: new FormControl('',[Validators.required]),
      password: new FormControl('',[Validators.required])
    })
  }

  validate() {
    //if session storage is empty do not validate and return the control
    if (sessionStorage.getItem('userName') == null || sessionStorage.getItem('password') == null) {
      this.signupWarning = true;
      return;
    }

    //validation for Name
    if (this.loginForm.get('userName')?.value != sessionStorage.getItem('userName')) {
      this.userName = "";
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

    //upon validation emit the confirmation to the parent.
    if (this.validateForm) this.signupShowEvent.emit(true);
    console.log("emitted");
  }

  //getters
  get name(){
    return this.loginForm.get('userName')
  }
  get pass(){
    return this.loginForm.get('password')
  }

}
