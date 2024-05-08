import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SharelocationComponent } from './sharelocation.component';

describe('SharelocationComponent', () => {
  let component: SharelocationComponent;
  let fixture: ComponentFixture<SharelocationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [SharelocationComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(SharelocationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
