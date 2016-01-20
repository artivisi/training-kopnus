import {Component} from 'angular2/core';
import {Injector} from 'angular2/core';
import {CanActivate, ComponentInstruction} from 'angular2/router';

import {AuthService} from '../auth/auth.service';

@Component({
    selector: 'halo-angular',
    templateUrl: './aplikasi/halo/halo.html'
})
@CanActivate((to: ComponentInstruction, from: ComponentInstruction) => {
    let inj: Injector = Injector.resolveAndCreate([AuthService]);
    let auth: AuthService = inj.get(AuthService);
    return auth.sudahLogin;
})
export class Halo {
    tamu: string;
    klikSimpan(x: string){
        console.log("Nama : "+x);
        this.tamu = x;
    }
}