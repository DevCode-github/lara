import { CanActivateFn } from '@angular/router';
import {CookieService} from 'ngx-cookie-service';

export const test1Guard: CanActivateFn = (route, state) => {
  let cookieSerivce : any;
  class temp{
    constructor(private cookieService:CookieService){
      cookieSerivce = this.cookieService
    }
  }
  console.log(cookieSerivce.get('logged_in'))
  return true; 
};
