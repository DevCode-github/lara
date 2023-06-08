import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { M2c2Component } from './m2c2/m2c2.component';
import { M2c1Component } from './m2c1/m2c1.component';

const routes: Routes = [
  {
    path : 'm2c2',
    component : M2c2Component
  },
  {
    path : 'm2c1',
    component : M2c1Component
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class M2RoutingModule { }
