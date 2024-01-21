import { NgModule, PLATFORM_ID } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { GetIdComponent } from './get-id/get-id.component';
import { ResetpassComponent } from './resetpass/resetpass.component';
import { UploadImageComponent } from './upload-image/upload-image.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { authGuard } from './guards/auth.guard';

const routes: Routes = [
  {
    path : 'login',
    component : LoginComponent
  },
  {
    path : 'signup',
    component : SignupComponent
  },
  {
    path : 'getId',
    component : GetIdComponent
  },
  {
    path : 'resetPass',
    component : ResetpassComponent
  },
  {
    path : 'login/resetPass',
    component : ResetpassComponent
  },
  {
    path : 'login/getId',
    component : GetIdComponent
  },
  {
    path : 'login/getId/resetPass',
    component : ResetpassComponent
  },
  {
    path : 'upload',
    component : UploadImageComponent
  },
  {
    path : 'dashboard',
    component : DashboardComponent,
    canActivate : [authGuard]
  },
  {
    path : 'dashboard/getId',
    component : GetIdComponent,
    canActivate : [authGuard]
  },
  {
    path : 'dashboard/getId/resetPass',
    component : ResetpassComponent,
  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
