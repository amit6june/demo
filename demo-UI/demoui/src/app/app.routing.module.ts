import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';


import {AddUserComponent} from './user/add-user.component';

import {WelcomeComponent} from './welcome/welcome.component';


const routes: Routes = [
 { path: 'welcome', component: WelcomeComponent },
  { path: '', redirectTo:'welcome',pathMatch:'full' },
  { path: 'add', component: AddUserComponent }
   
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ],
  declarations: []
})
export class AppRoutingModule { }