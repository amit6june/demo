import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthenticateuserService } from './authenticateuser.service';

@Component({
  selector: 'app-authenticateuser',
  templateUrl: './authenticateuser.component.html',
  styleUrls: ['./authenticateuser.component.css']
})
export class AuthenticateuserComponent implements OnInit {

  constructor(private authService: AuthenticateuserService,
                private router: Router) { }

  ngOnInit() {
  }

   loginUser(loginForm: NgForm) {

  let userName = loginForm.form.value.userName;
  let password = loginForm.form.value.password;
   
  this.authService.login(userName, password);
   this.router.navigate(['/userslist']);
     
  };

}
