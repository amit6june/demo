import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import {UserService} from './user/user.service';
import { UserComponent } from './user/user.component';
import { RouterModule } from '@angular/router';
import { AddUserComponent } from './user/add-user.component';
import { AppRoutingModule } from './app.routing.module';
import {HttpClientModule} from "@angular/common/http";
//import {HttpClientModule} from "@angular/common/http";
@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    AddUserComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  exports: [RouterModule],
 providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
