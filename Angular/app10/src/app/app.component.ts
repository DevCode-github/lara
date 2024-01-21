import { Component } from '@angular/core';
import { NavigationEnd, NavigationStart, Router } from '@angular/router';
import { AuthService } from './services/auth.service';
import { authGuard } from './guards/auth.guard';
import { AdminServiceService } from './admin-service.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app10';
  hidden = localStorage.getItem('logged_in') == 'yes';
  constructor(private authService :AuthService, private adminService: AdminServiceService, private router :Router){
    this.router.events.subscribe((e: any) => {
      if (e instanceof NavigationStart){
        if (localStorage.getItem('logged_in') == 'yes') this.hidden = true
        else this.hidden = false;
      }
    })
  }

  authenticate(event :any){
    console.log("dsfsf")
    if (localStorage.getItem('logged_in') == 'yes') this.hidden = true
    else this.hidden = false;
  }

  logout(event :any){
    this.authService.logout();
    this.hidden = false;
  }

}
