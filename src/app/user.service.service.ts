import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserService {

 constructor(private http: HttpClient) { }

  link1  = "http://localhost:9005/insertrecord";
  insertdata1(data:any){
    return this.http.post(this.link1, data);
  }

  link2  = "http://localhost:9005/updaterecord";
  updatedata1(data:any){
    return this.http.post(this.link2,data);
  }
  link3  = "http://localhost:9005/deleterecord";
  deletedata1(data:any){
   return this.http.post(this.link3,data);

  }

}
