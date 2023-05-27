import { Component, Input} from '@angular/core';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app6_CE_signup_login';

  //field to catch the value from child
  signupShowEvent = false;
  
  //method to catch the values thrown by the event emitter of the child class
  changeSignupShow(signupShowEvent: boolean){
    this.signupShowEvent = signupShowEvent;
    console.log(signupShowEvent+ " from parent");
  }
}
