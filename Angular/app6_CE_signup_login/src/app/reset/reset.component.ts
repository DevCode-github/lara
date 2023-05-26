import { Component } from '@angular/core';

@Component({
  selector: 'app-reset',
  templateUrl: './reset.component.html',
  styleUrls: ['./reset.component.css']
})
export class ResetComponent {
  cleared = false;
  reset(){
    sessionStorage.clear();
    this.cleared = true;
  }
}
