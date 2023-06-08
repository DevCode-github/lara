import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { M1RoutingModule } from './m1-routing.module';
import { M1c1Component } from './m1c1/m1c1.component';
import { M1c2Component } from './m1c2/m1c2.component';


@NgModule({
  declarations: [
    M1c1Component,
    M1c2Component
  ],
  imports: [
    CommonModule,
    M1RoutingModule
  ]
})
export class M1Module { }
