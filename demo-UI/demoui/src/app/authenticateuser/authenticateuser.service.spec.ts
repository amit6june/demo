import { TestBed, inject } from '@angular/core/testing';

import { AuthenticateuserService } from './authenticateuser.service';

describe('AuthenticateuserService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [AuthenticateuserService]
    });
  });

  it('should be created', inject([AuthenticateuserService], (service: AuthenticateuserService) => {
    expect(service).toBeTruthy();
  }));
});
