import { Component, OnInit } from '@angular/core';
import {FormGroup, FormBuilder, FormControl,Validators} from '@angular/forms'
import {Router} from '@angular/router';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent{
  
  //feilds
  //form field
  form: FormGroup;
  //to store the data from the session storage
  data: any;
  //field to confirm validation and display succes msg
  infomsg: Boolean = false;
  //field for final validation
  submitted =false;

  //intializing form
  constructor (formBuilder: FormBuilder){
    this.form = formBuilder.group({
      firstName: new FormControl('',[Validators.required,Validators.minLength(3)]),
      lastName: new FormControl('',[Validators.required,Validators.minLength(3)]),
      age: new FormControl('',[Validators.required , Validators.min(10), Validators.max(100)]),
      password: new FormControl('',Validators.minLength(8))
    })
  }

  //Saving data to session storage
  saveData(){
    this.data = this.form.value;
    sessionStorage.setItem('firstName', this.data['firstName'])
    sessionStorage.setItem('lastName', this.data['lastName'])
    sessionStorage.setItem('age', this.data['age'])
    sessionStorage.setItem('password', this.data['password'])
    //confirming validation
    this.infomsg = true;
    this.submitted = true
  }

  //getters
  get firstName(){
    return this.form.get('firstName');
  }
  get lastName(){
    return this.form.get('lastName');
  }
  get age(){
    return this.form.get('age')
  }
  get length(){
    return this.form.get('password')
  }
  get msg() {
    return this.infomsg;
  }
}
