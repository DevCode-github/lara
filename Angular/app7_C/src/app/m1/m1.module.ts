import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { T1Component } from './t1/t1.component';
import { T11Component } from './t11/t11.component';



@NgModule({
  declarations: [
    T1Component,
    T11Component
  ],
  imports: [
    CommonModule
  ],
  exports: [
    T1Component,
    T11Component
  ]
})
export class M1Module { }
