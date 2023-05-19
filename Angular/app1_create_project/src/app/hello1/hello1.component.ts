import { Component, INJECTOR, Inject } from '@angular/core';

@Component({
  selector: 'app-hello1',
  templateUrl: './hello1.component.html',
  styleUrls: ['./hello1.component.css']
})

export class Hello1Component {
  field1 = 'abc';
  field2 = 'abc';
  field3 = 'abc';
  field4 = 'abc';
  field5 = 'abc';

  field6: number = 123;
  field7: number = 12.3;
  field8: string = 'abc';
  field9: string = 't';
  field10: boolean = true;
  field11: any = 123;
  field12: any = '123';
  field13: any = 1.23;
  field14: any = '1';

  a1: number[] = [10, 20, 30, 3.5, 1.0, 400];
  a2: string[] = ['abc' ,'xyz' ,'hello', 'test'];
  a3: boolean[] = [true, false];
  a4: any[] = [10, 3.5, 'abc' , false];

  constructor(){
    console.log("i am from the constructor");
    this.a4 = [122,123,124,125];
    this.field1 = 'hello1';
  }

  test1(){
    console.log("from test1");
  }
  test2(){
    console.log("from test2");
    return 1000;
  }
  test3(): number{
    console.log("from test3");
    return 1000;
  }
  test4(): string{
    console.log("from test4");
    return '1000';
  }
  test5(): any{
    console.log("from test5");
    return true;
  }
  test6(): any{
    console.log("from test6");
    return this.test3();
  }
}
