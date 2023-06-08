import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { M1c1Component } from './m1c1/m1c1.component';
import { M1c2Component } from './m1c2/m1c2.component';

const routes: Routes = [
  {
    path : 'm1c1',
    component : M1c1Component
  },
  {
    path : 'm1c2',
    component : M1c2Component
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class M1RoutingModule { }
