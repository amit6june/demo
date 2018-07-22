import { Component } from '@angular/core';

import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthenticateuserService } from './authenticateuser/authenticateuser.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';

    constructor(private authService: AuthenticateuserService,
                private router: Router) { }

    logOut(): void {
        this.authService.logout();
        this.router.navigateByUrl('/welcome');
    }
}
