import {Component} from 'angular2/core';

@Component({
    selector: 'halo-angular',
    templateUrl: './aplikasi/aplikasi.html'
})
export class Aplikasi {
    tamu: string;
    klikSimpan(x: string){
        console.log("Nama : "+x);
        this.tamu = x;
    }
}