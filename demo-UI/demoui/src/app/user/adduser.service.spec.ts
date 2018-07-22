import { TestBed, inject } from '@angular/core/testing';

import { AddUserServiceService } from './adduser.service';

describe('AddUserServiceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [AddUserServiceService]
    });
  });

  it('should be created', inject([AddUserServiceService], (service: AddUserServiceService) => {
    expect(service).toBeTruthy();
  }));
});
