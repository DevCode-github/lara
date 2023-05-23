import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-f3',
  templateUrl: './f3.component.html',
  styleUrls: ['./f3.component.css']
})
export class F3Component {
  f1: FormGroup;

  //creating fields of formControl  types using formBuilder
  /*
  using validators.required as the second argument in FormControl to bind formcontrol to formgroup to validate the forms.
  */
  constructor (formBuilder: FormBuilder){
    this.f1 = formBuilder.group({
      firstName: new FormControl(),
      lastName: new FormControl(),
      age: new FormControl()
    })
  }

  //methods for accessing values while validation
  get firstName() {
    return this.f1.get('firstName');
  }
  get lastName() {
    return this.f1.get('lastName');
  }
  get age() {
    return this.f1.get('age');
  }

  //method to display objects value
  save(){
    // if (this.f1.invalid) {
    //   this.f1.markAllAsTouched();
    //   return;
    // }
    console.log(this.f1.value)
  }
}
