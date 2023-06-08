import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { M2RoutingModule } from './m2-routing.module';
import { M2c2Component } from './m2c2/m2c2.component';
import { M2c1Component } from './m2c1/m2c1.component';


@NgModule({
  declarations: [
    M2c2Component,
    M2c1Component
  ],
  imports: [
    CommonModule,
    M2RoutingModule
  ]
})
export class M2Module { }
