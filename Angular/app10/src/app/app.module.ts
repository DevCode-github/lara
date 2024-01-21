import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { SignupComponent } from './signup/signup.component';
import { LoginComponent } from './login/login.component';
import { ResetpassComponent } from './resetpass/resetpass.component';
import { GetIdComponent } from './get-id/get-id.component';
import { UploadImageComponent } from './upload-image/upload-image.component';
import { AppCommonModule } from './app-common/app-common.module';
import { DashboardComponent } from './dashboard/dashboard.component';
import { CookieService } from 'ngx-cookie-service';

@NgModule({
  declarations: [
    AppComponent,
    SignupComponent,
    LoginComponent,
    ResetpassComponent,
    GetIdComponent,
    UploadImageComponent,
    DashboardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    AppCommonModule
  ],
  providers: [
    CookieService,
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
