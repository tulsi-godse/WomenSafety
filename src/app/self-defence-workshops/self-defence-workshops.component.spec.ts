import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SelfDefenceWorkshopsComponent } from './self-defence-workshops.component';

describe('SelfDefenceWorkshopsComponent', () => {
  let component: SelfDefenceWorkshopsComponent;
  let fixture: ComponentFixture<SelfDefenceWorkshopsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [SelfDefenceWorkshopsComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(SelfDefenceWorkshopsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
