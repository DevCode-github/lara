import { Component } from '@angular/core';
import {FormGroup,FormBuilder,FormControl} from '@angular/forms'

@Component({
  selector: 'app-f1',
  templateUrl: './f1.component.html',
  styleUrls: ['./f1.component.css']
})
export class F1Component {
  form: FormGroup;

  constructor(private formBuilder: FormBuilder) {
    this.form = formBuilder.group({
      firstName: new FormControl(),
      lastName: new FormControl(),
      age: new FormControl(),
    })
  }
  save() {
    console.log(this.form.value);
  }
}
