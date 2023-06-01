import { Component } from '@angular/core';
import {FormGroup, FormBuilder, FormControl} from '@angular/forms'

@Component({
  selector: 'app-test2',
  templateUrl: './test2.component.html',
  styleUrls: ['./test2.component.css']
})
export class Test2Component {
  login: FormGroup;
  message: string = '';

  constructor (formBuilder: FormBuilder){
    this.login = formBuilder.group({
      userName: new FormControl(),
      password: new FormControl()
    })
  }

  authenticate(){
    var userName = this.login.value['userName'];
    var password = this.login.value['password'];

    var s1 = sessionStorage.getItem("person");
    if (s1) var obj = JSON.parse(s1)
    else console.log("no signup signatures persent")
    var un = obj['userName']
    var pw= obj['password']
    if (userName == un && password == pw) this.message = "login successful"
    else this.message = "either name/password is wrong"
  }
}
