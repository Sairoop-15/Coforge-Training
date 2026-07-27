import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Subtraction } from './subtraction';

describe('Subtraction', () => {
  let component: Subtraction;
  let fixture: ComponentFixture<Subtraction>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [Subtraction],
    }).compileComponents();

    fixture = TestBed.createComponent(Subtraction);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
