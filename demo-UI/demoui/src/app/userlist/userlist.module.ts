import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { UserlistComponents } from './userlist-components/userlist-components';
import { UserlistServiceService } from './userlist-service.service';

@NgModule({
  imports: [
    CommonModule,
RouterModule.forChild([
  {
    path:'userslist',component:UserlistComponents}
  
]

)
  ],
  declarations: [UserlistComponents],
  providers: [UserlistServiceService]
})
export class UserlistModule { }
