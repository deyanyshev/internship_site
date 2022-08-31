import { Component, OnInit } from '@angular/core';
import {UserService} from '../../service/user.service';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-auth',
  templateUrl: './auth.component.html',
  styleUrls: ['./auth.component.css']
})
export class AuthComponent implements OnInit {

  constructor(private userService: UserService, ngbModule: NgbModule) {
  }

  ngOnInit() {
  }
}
