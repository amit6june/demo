import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UserlistComponents } from './userlist-components';

describe('UserlistComponentsComponent', () => {
  let component: UserlistComponents;
  let fixture: ComponentFixture<UserlistComponents>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UserlistComponents ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UserlistComponents);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
