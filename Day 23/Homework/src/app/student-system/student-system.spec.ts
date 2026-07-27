import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StudentSystem } from './student-system';

describe('StudentSystem', () => {
  let component: StudentSystem;
  let fixture: ComponentFixture<StudentSystem>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [StudentSystem],
    }).compileComponents();

    fixture = TestBed.createComponent(StudentSystem);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
