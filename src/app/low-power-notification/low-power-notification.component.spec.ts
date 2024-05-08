import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LowPowerNotificationComponent } from './low-power-notification.component';

describe('LowPowerNotificationComponent', () => {
  let component: LowPowerNotificationComponent;
  let fixture: ComponentFixture<LowPowerNotificationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [LowPowerNotificationComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(LowPowerNotificationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
