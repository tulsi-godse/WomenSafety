import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FreeVideosComponent } from './free-videos.component';

describe('FreeVideosComponent', () => {
  let component: FreeVideosComponent;
  let fixture: ComponentFixture<FreeVideosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [FreeVideosComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(FreeVideosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
