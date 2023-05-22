import { Component } from '@angular/core';
import {FormGroup, FormBuilder, FormControl} from '@angular/forms';

@Component({
  selector: 'app-f2',
  templateUrl: './f2.component.html',
  styleUrls: ['./f2.component.css']
})
export class F2Component {
  form: FormGroup;

  constructor(private formBuilder: FormBuilder){
    this.form = formBuilder.group({
      firstName : new FormControl(),
      password : new FormControl(),
      email : new FormControl()
    })
  }

  login(){
    console.log(this.form.value);
  }
  save() {
    console.log(this.form.value);
  }
}
