import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BuchlisteComponent } from './buchliste.component';

describe('BuchlisteComponent', () => {
  let component: BuchlisteComponent;
  let fixture: ComponentFixture<BuchlisteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BuchlisteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BuchlisteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
