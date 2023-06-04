import { ComponentFixture, TestBed } from '@angular/core/testing';

import { T22Component } from './t22.component';

describe('T22Component', () => {
  let component: T22Component;
  let fixture: ComponentFixture<T22Component>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [T22Component]
    });
    fixture = TestBed.createComponent(T22Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
