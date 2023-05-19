import { style } from '@angular/animations';
import { Component } from '@angular/core';

@Component({
  selector: 'app-simple-component2',
  template: `
    <h1>
      <p>
        simple-component2 works!
      </p>
    </h1>
  `,
  styles: [
      '*{padding : 0; margin: 0; color : blue;}'
  ]
})
export class SimpleComponent2Component {

}
