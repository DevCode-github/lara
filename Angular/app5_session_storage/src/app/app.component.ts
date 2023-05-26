import { Component, VERSION } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app5_session_storage';

  name1: string = "Angular " + VERSION.full;

  //to save data in session storage
  saveData() {
    sessionStorage.setItem('name1','Divyanshu');
  }

  //to get data from session storage
  getData() {
    this.name1 = String(sessionStorage.getItem('name1')); 
    return this.name1;
  }

  //delete data
  delData() {
    sessionStorage.removeItem('name1');
  }

  //clear session
  clearData() {
    sessionStorage.clear();
  }
}
