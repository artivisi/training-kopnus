import {Component} from 'angular2/core';

@Component({
    selector: 'halo-angular',
    templateUrl: './aplikasi/halo/halo.html'
})
export class Halo {
    tamu: string;
    klikSimpan(x: string){
        console.log("Nama : "+x);
        this.tamu = x;
    }
}