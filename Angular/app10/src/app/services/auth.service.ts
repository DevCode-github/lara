import { Injectable } from '@angular/core';
import { CookieService } from 'ngx-cookie-service/lib/cookie.service';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  constructor(private cookiesService :CookieService) { 
  }

  logout(): void {
    localStorage.setItem('logged_in', 'no');
    this.cookiesService.delete('token');
  }
}
