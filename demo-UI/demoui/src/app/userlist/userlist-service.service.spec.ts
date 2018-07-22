import { TestBed, inject } from '@angular/core/testing';

import { UserlistServiceService } from './userlist-service.service';

describe('UserlistServiceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [UserlistServiceService]
    });
  });

  it('should be created', inject([UserlistServiceService], (service: UserlistServiceService) => {
    expect(service).toBeTruthy();
  }));
});
