import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { C1Component } from './c1/c1.component';
import { LoginComponent } from './login/login.component';
import { RegComponent } from './reg/reg.component';
import { DevComponent } from './dev/dev.component';
import { SearchRecordsComponent } from './search-records/search-records.component';
import { LogoutComponent } from './logout/logout.component';
import { SimpleComponentComponent } from './simple-component/simple-component.component';
import { SimpleComponent2Component } from './simple-component2/simple-component2.component';
import { Hello1Component } from './hello1/hello1.component';
import { F1Component } from './f1/f1.component';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import { F2Component } from './f2/f2.component';

@NgModule({
  declarations: [
    AppComponent,
    C1Component,
    LoginComponent,
    RegComponent,
    DevComponent,
    SearchRecordsComponent,
    LogoutComponent,
    SimpleComponentComponent,
    SimpleComponent2Component,
    Hello1Component,
    F1Component,
    F2Component,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
