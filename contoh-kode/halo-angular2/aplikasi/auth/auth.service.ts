import {Injectable} from 'angular2/core';

import {Injector} from 'angular2/core';
import {ComponentInstruction} from 'angular2/router';

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

export const cekLogin = (to: ComponentInstruction, from: ComponentInstruction) => {
    let inj: Injector = Injector.resolveAndCreate([AuthService]);
    let auth: AuthService = inj.get(AuthService);
    return auth.sudahLogin;
};