import { ComponentFixture, TestBed } from '@angular/core/testing';

import { T11Component } from './t11.component';

describe('T11Component', () => {
  let component: T11Component;
  let fixture: ComponentFixture<T11Component>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [T11Component]
    });
    fixture = TestBed.createComponent(T11Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
