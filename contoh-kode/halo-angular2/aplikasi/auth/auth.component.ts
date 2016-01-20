import {Component} from 'angular2/core';

import {AuthService} from './auth.service';

@Component({
    selector: "auth",
    template: `    
    <div *ngIf="!sudahLogin">
        <form>
            Username : <input #username><br>
            Password : <input #password type="password"><br>
            <button (click)="login(username.value, password.value)">Login</button>
        </form>
    </div>
    <div *ngIf="sudahLogin">
    Current user : {{currentUser}} <br>
    <form>
        <button (click)="logout()">Logout</button>
    </form>
    </div>
    `
})
export class AuthComponent {
    constructor(private authService: AuthService){}
    
    get sudahLogin(){
        return this.authService.sudahLogin;
    }
    
    get currentUser(){
        return this.authService.currentUser;
    }
    
    login(username: string, password: string){
        console.log("Username : "+username+" Password : "+password);
        this.authService.login(username, password);
    }
    
    logout(){
        console.log("Logout");
        this.authService.logout();
    }
}