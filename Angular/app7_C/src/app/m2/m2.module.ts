import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { T2Component } from './t2/t2.component';
import { T22Component } from './t22/t22.component';
import { M1Module } from '../m1/m1.module';



@NgModule({
  declarations: [
    T2Component,
    T22Component
  ],
  imports: [
    CommonModule,
    M1Module
  ],
  exports: [
    T2Component,
    T22Component
  ]
})
export class M2Module { }
