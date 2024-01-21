import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AppCommonRoutingModule } from './app-common-routing.module';
import { FooterComponent } from './footer/footer.component';


@NgModule({
  declarations: [
    FooterComponent
  ],
  imports: [
    CommonModule,
    AppCommonRoutingModule
  ],
  exports : [
    FooterComponent
  ]
})
export class AppCommonModule { }
