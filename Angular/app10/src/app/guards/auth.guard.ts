import { PLATFORM_ID } from '@angular/core';
import { CanActivateFn } from '@angular/router';
import {CookieService} from 'ngx-cookie-service';
import { AuthService } from '../services/auth.service';

export const authGuard: CanActivateFn = (route, state) => {
  return localStorage.getItem('logged_in') == 'yes';
};