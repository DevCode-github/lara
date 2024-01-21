import { Component, PLATFORM_ID } from '@angular/core';
import { AdminServiceService } from '../admin-service.service';
import {FormGroup, FormControl, Validators, FormBuilder} from '@angular/forms';
import { CookieService,CookieOptions } from 'ngx-cookie-service/public-api';
import { authGuard } from '../guards/auth.guard';
import { Router } from '@angular/router';
import { platformBrowser } from '@angular/platform-browser';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  loginForm :FormGroup;
  data : any;
  msg = false;
  remember: FormGroup;
  constructor(formBuilder :FormBuilder
              , private adminService:AdminServiceService
              , private cookieSerivce:CookieService
              ,private router:Router
              ){
    this.loginForm = formBuilder.group({
      email: new FormControl('',Validators.required),
      password: new FormControl('',Validators.required)
    })
    this.remember = formBuilder.group({
      rememberMe : new FormControl()
    })
  }

  login(){
    this.adminService.login(this.loginForm.value).subscribe(
      (r1) => {
        console.log(r1)
        this.data = r1.valueOf();
        if(this.data['status']) {
          this.msg=true;
          this.cookieSerivce.set('token',this.data['token'],1)
          localStorage.setItem('logged_in','yes');
          this.router.navigate(["dashboard"]);
        }
      }
    )
  }
}
