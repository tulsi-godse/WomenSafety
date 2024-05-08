import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmergencycontactsComponent } from './emergencycontacts.component';

describe('EmergencycontactsComponent', () => {
  let component: EmergencycontactsComponent;
  let fixture: ComponentFixture<EmergencycontactsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [EmergencycontactsComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(EmergencycontactsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
