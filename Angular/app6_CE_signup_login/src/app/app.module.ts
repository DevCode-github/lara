import { Component, NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { LoginComponent } from './login/login.component';
import {FormsModule,ReactiveFormsModule} from '@angular/forms';
import { SignupsuccessComponent } from './signupsuccess/signupsuccess.component';
import { RouterModule, Routes } from '@angular/router';
import { ResetComponent } from './reset/reset.component';

const appRoutes : Routes = [
  {
    path : 'signupsuccess',
    component : SignupsuccessComponent
  }
]

@NgModule({
  declarations: [
    AppComponent,
    SignUpComponent,
    LoginComponent,
    SignupsuccessComponent,
    ResetComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
