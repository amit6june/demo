import { Injectable } from '@angular/core';

import { IUser } from './userInterface';

@Injectable()
export class AuthenticateuserService {

  currentUser: IUser;

isLoggedIn(): boolean {
         console.log(this.currentUser);
     if(this.currentUser)
        return true;
        else
        return false;
    }


  constructor() { 
 
  }


login(userName: string, password: string): void {
       
            this.currentUser = {
                id: 1,
                userName: userName,
                isAdmin: true,
                loggedin:true
            };
            return;
        }
    

 logout(): void {
        this.currentUser = null;
    }       
}
