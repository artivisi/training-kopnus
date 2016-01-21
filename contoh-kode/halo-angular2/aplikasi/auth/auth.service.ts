import {Injectable} from 'angular2/core';

@Injectable()
export class AuthService {
    _uservalid: string = "endy";
    _passwordvalid: string = "123";
    
    get sudahLogin(): boolean {
        console.log("Sudah Login ? "+localStorage.getItem("currentUser") != null);
        return localStorage.getItem("currentUser") != null;
    }
    
    login(username: string, password: string) {
        if(username == this._uservalid && 
           password == this._passwordvalid){
               localStorage.setItem("currentUser", username);
           } else {
               console.log("User/Password salah");
           }
    }
    
    get currentUser(){
        return localStorage.getItem("currentUser");
    }
    
    logout(){
        localStorage.removeItem("currentUser");
    }
}