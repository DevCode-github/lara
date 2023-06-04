import { Component } from '@angular/core';
import { FormGroup,FormBuilder,FormControl,Validators, FormArray, Form } from '@angular/forms';
import { Test3Service } from '../test3.service';

@Component({
  selector: 'app-test1',
  templateUrl: './test1.component.html',
  styleUrls: ['./test1.component.css']
})
export class Test1Component {
  person: FormGroup;
  skill: any = [
    {id : 15, name: "c"},
    {id : 25, name : "c++"},
    {id : 31, name : "java"},
    {id : 45, name : "oracle"}
  ]
  selectedSkill: any = [];

  constructor (private formBuilder: FormBuilder, private service: Test3Service){
    this.person = formBuilder.group({
      firstName: new FormControl(),
      lastName: new FormControl(),
      age: new FormControl(),
      address: formBuilder.group({
        houseNo: new FormControl(),
        streetName: new FormControl(),
        city: new FormControl()
        
      }),
      userName: new FormControl(),
      password: new FormControl(),
      mobileNumbers: new FormArray([formBuilder.group({
        mobileNumber: new FormControl(),
        serviceProvider: new FormControl()
        })
      ]),
      knownSkill: new FormArray([])
    })
    for (let i = 0 ; i < this.skill.length ; i++){
      this.knownSkill.push(new FormControl()) 
    }

  }

  
  //read only getters
  get mobileNumbers(){
    return this.person.get('mobileNumbers') as FormArray;
  }
  get knownSkill(){
    return this.person.get('knownSkill') as FormArray;
  }

  addNewMobileNumber(event: any){
    this.mobileNumbers.push(this.formBuilder.group({
      mobileNumber: new FormControl(),
      serviceProvider: new FormControl()      
    }))
    event.preventDefault();
  }
  removeMobileNumber(event: any){
    if (this.mobileNumbers.length > 1) this.mobileNumbers.removeAt(this.mobileNumbers.length-1);
    else alert("Nothing to Remove")
    event.preventDefault();
  }

  save(){
    alert(this.person.value.knownSkill)
    for ( var i = 0 ; i < this.knownSkill.length ; i++){
      if(this.knownSkill.controls[i].value){
        this.selectedSkill.push({"id" : this.skill[i].id})
      }
    }
    this.person.value.mobileNumber = this.selectedSkill;
    console.log(this.selectedSkill)
    // console.log(this.person.value)
    var s1 = JSON.stringify(this.person.value);
    sessionStorage.setItem('person', s1);
    this.service.save(this.person.value);
  }
}
