import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { AdminServiceService } from '../admin-service.service';

@Component({
  selector: 'app-resetpass',
  templateUrl: './resetpass.component.html',
  styleUrls: ['./resetpass.component.css']
})
export class ResetpassComponent {
  resetForm :FormGroup;
  match = true;
  data :any;
  msg = false;
  constructor(formBuilder :FormBuilder, private adminService :AdminServiceService){
    this.resetForm = formBuilder.group({
      email :new FormControl('',Validators.required),
      resetCode :new FormControl('',Validators.required),
      newPassword :new FormControl('',Validators.required),
      confirmPassword :new FormControl('',Validators.required)
    })
  }

  reset(){
    if (this.resetForm.value["newPassword"] !== this.resetForm.value["confirmPassword"]) {
      this.match = false;
      return
    }
    
    this.adminService.reset({"email" : this.resetForm.value["email"],
                            "password" : this.resetForm.value['newPassword'],
                            "resetCode" : this.resetForm.value['resetCode']})
                            .subscribe(
                                stat => {
                                  console.log(stat)
                                  this.data = stat.valueOf();
                                  if (this.data['status']) this.msg = true;
                                }
                            )
  }


}
