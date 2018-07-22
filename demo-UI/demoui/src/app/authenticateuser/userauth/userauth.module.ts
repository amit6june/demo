import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';


import { RouterModule, Routes } from '@angular/router';
import { AuthenticateuserComponent } from '../authenticateuser.component';
import { AuthenticateuserService } from '../authenticateuser.service';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';

@NgModule({
  imports: [
    CommonModule,
     FormsModule,                               // <========== Add this line!
    ReactiveFormsModule,
RouterModule.forChild([
  {
    path:'login',component:AuthenticateuserComponent}
  
]

)
  ],
  declarations: [AuthenticateuserComponent],
  providers: [AuthenticateuserService]
})
export class UserauthModule { }
