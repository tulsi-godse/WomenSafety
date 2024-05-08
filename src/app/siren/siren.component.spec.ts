import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SirenComponent } from './siren.component';

describe('SirenComponent', () => {
  let component: SirenComponent;
  let fixture: ComponentFixture<SirenComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [SirenComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(SirenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
