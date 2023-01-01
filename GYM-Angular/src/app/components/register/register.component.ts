import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/user.service.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private s1:UserService) { }

  ngOnInit(): void {
  }
  //inserting data
  insertdata(insertform: { value: any; }) {
    return this.s1.insertdata1(insertform.value).subscribe();
  }

}
