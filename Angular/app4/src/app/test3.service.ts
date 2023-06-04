import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class Test3Service {

  constructor() { }
  save(data: any){
    console.log("saving from service")
    console.log(data);
  }
}
