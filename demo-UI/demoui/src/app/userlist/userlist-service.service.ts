import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Http, Response } from '@angular/http';
import { User } from '../models/user.model';

import 'rxjs/add/operator/map';
import { Observable } from 'rxjs/Observable';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class UserlistServiceService {

    constructor(private http:HttpClient) {}

    private userUrl = 'http://localhost:8081/allusers';

 private addUser = 'http://localhost:8081/addUser';

     private _url:string='http://localhost:8808/mydata.json';

  public getUsers() {
      console.log(this.userUrl)
    return this.http.get(this.userUrl);
  }

public getUsers1() {
    return this.http.get(this.userUrl).map((res: Response) => res.json());
  }
  

  public deleteUser(user) {
    return this.http.delete(this.userUrl + "/"+ user.id);
  }

  public createUser(user) {
    console.log(user);
    return this.http.post(this.addUser, user);
  }

}

