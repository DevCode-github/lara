import { Component, Input} from '@angular/core';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app6_CE_signup_login';

  //field to catch the value from child
  signupShowEventp = false;
  signupSuccessEventp = false;
  //method to catch the values thrown by the event emitter of the child class
  signupShowEvent(signupShowEvent: boolean){
    this.signupShowEventp = signupShowEvent;
  }

  signupSuccessEvent(){
    this.signupShowEventp = false;
  }
}
