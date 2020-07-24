import { TestBed } from '@angular/core/testing';

import { BuchService } from './buch.service';

describe('BuchserviceService', () => {
  let service: BuchService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BuchService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
