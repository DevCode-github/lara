import { ComponentFixture, TestBed } from '@angular/core/testing';

import { T2Component } from './t2.component';

describe('T2Component', () => {
  let component: T2Component;
  let fixture: ComponentFixture<T2Component>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [T2Component]
    });
    fixture = TestBed.createComponent(T2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
