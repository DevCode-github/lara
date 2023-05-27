import { Component, Input, OnChanges, SimpleChanges } from '@angular/core';
import {FormGroup, FormBuilder, FormControl,Validators} from '@angular/forms'
import {Router} from '@angular/router';
import { AppComponent } from '../app.component';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent{
  //Input decorator to read data from parent which confirms successful login
  @Input() signupShowEvent = false;

  //feilds
  //form field
  form: FormGroup;
  //to store the data from the session storage
  data: any;
  //field to confirm validation and display succes msg
  infomsg: Boolean = false;
  submitted = false;

  //intializing form
  constructor (formBuilder: FormBuilder){
    this.form = formBuilder.group({
      userName: new FormControl('',[Validators.required,Validators.minLength(3)]),
      firstName: new FormControl('',[Validators.required,Validators.minLength(3)]),
      lastName: new FormControl('',[Validators.required,Validators.minLength(3)]),
      age: new FormControl('',[Validators.required , Validators.min(10), Validators.max(100)]),
      password: new FormControl('',Validators.minLength(8))
    })
  }
  //function to detect changes in the input field and set the changed property from the parent.
  //Its triggered upon successfull login
  ngOnChanges(changes: SimpleChanges) {
    // changes.prop contains the old and the new value...
    const chng = changes['signupShowEvent'];
    this.signupShowEvent = chng.currentValue;
    //changing field that decides form hidden property to false
    this.submitted = false;
    //changing field that decides validation msg to false
    this.infomsg = false;
    //resetting the form
    this.form.reset();
    //confirming changes in the console
    console.log(this.signupShowEvent + " from ngOnChanges")
  }

  //Saving data to session storage
  saveData(){
    this.data = this.form.value;
    sessionStorage.setItem('userName', this.data['userName']),
    sessionStorage.setItem('firstName', this.data['firstName'])
    sessionStorage.setItem('lastName', this.data['lastName'])
    sessionStorage.setItem('age', this.data['age'])
    sessionStorage.setItem('password', this.data['password'])
    //confirming validation
    this.infomsg = true;
    this.submitted = true;
    this.signupShowEvent = false;
  }

  //getters
  get userName(){
    return this.form.get('userName')
  }
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
