import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { M3c1Component } from './m3/m3c1/m3c1.component';
import { M3c2Component } from './m3/m3c2/m3c2.component';

const routes: Routes = [
  {
    path : 'm3c1',
    component : M3c1Component
  },
  {
    path : 'm3c2',
    component : M3c2Component
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
