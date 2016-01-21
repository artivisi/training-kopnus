import {Component} from 'angular2/core';
import {Injector} from 'angular2/core';
import {CanActivate, ComponentInstruction} from 'angular2/router';

import {AuthService} from '../auth/auth.service';
import {cekLogin} from '../auth/auth.service';

@Component({
    selector: 'halo-angular',
    templateUrl: './aplikasi/halo/halo.html'
})
@CanActivate(cekLogin)
export class Halo {
    tamu: string;
    klikSimpan(x: string){
        console.log("Nama : "+x);
        this.tamu = x;
    }
}