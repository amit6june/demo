import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { User } from '../../models/user.model';
import { UserlistServiceService } from '../userlist-service.service';

@Component({
  templateUrl: './userlist-components.html',
  styleUrls: ['./userlist-components.css']
})
export class UserlistComponents implements OnInit {

  users: User[];
   alltype:any[]
  constructor(private router: Router, private userListService: UserlistServiceService) { }

  ngOnInit() {
    this.userListService.getUsers().subscribe( (data:User[]) => this.users = data);
  }  
   
  deleteUser(user: User): void {
    this.userListService.deleteUser(user)
      .subscribe( data => {
        this.users = this.users.filter(u => u !== user);
      })
  };

}
