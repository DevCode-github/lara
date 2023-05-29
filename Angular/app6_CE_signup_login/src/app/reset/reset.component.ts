import { Component, Input, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-reset',
  templateUrl: './reset.component.html',
  styleUrls: ['./reset.component.css']
})
export class ResetComponent {
  //Input to reset the Reset component
  //recieves the value from signupShowEvent, if false means signup is true, that database is filled
  @Input() showReset = false;

  //validation for clearing database
  cleared = false;

  //method gets invoked on changes to input
  ngOnChanges(changes: SimpleChanges){
    var chng = changes['showReset']
    if (chng.currentValue == false) this.cleared = false;
  }

  //method get invoked on click
  reset(){
    sessionStorage.clear();
    this.cleared = true;
  }
}
