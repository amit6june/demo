import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';

import { RouterModule } from '@angular/router';
import { AddUserComponent } from './user/add-user.component';
import { AppRoutingModule } from './app.routing.module';
import {HttpClientModule} from "@angular/common/http";
import { UserlistModule } from './userlist/userlist.module';
import { WelcomeComponent } from './welcome/welcome.component';
import { AddUserServiceService } from './user/adduser.service';
import { AuthenticateuserComponent } from './authenticateuser/authenticateuser.component';
import { UserauthModule } from './authenticateuser/userauth/userauth.module';
  

@NgModule({
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    UserlistModule,   
    FormsModule, 
    UserauthModule
  ],
  declarations: [
    AppComponent,
    AddUserComponent,
    WelcomeComponent
  ],
  exports: [RouterModule],
  bootstrap: [AppComponent],
  providers: [AddUserServiceService]
})
export class AppModule { }
