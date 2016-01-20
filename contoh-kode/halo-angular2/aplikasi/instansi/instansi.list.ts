import {Component} from 'angular2/core';

import {Response} from 'angular2/http';

import {Instansi} from './instansi';
import {InstansiService} from './instansi.service';

import {Observable} from 'rxjs';

@Component({
    templateUrl: './aplikasi/instansi/instansi.list.html',
    selector: '<instansi-list>'
})
export class InstansiList {
    constructor(private instansiService: InstansiService){
        this.loadDaftarInstansi();
     }
    
    daftarInstansi: any;
    
    loadDaftarInstansi(){
        let hasil: Observable<Response> = this.instansiService.getDaftarInstansi();
        
        hasil.subscribe(
            (data) => {this.daftarInstansi = data}, // response data kalau sukses
            (err) => {console.log(err)},            // dijalankan waktu error
            () => {console.log("Request sudah diresponse")} // dijalankan waktu complete
        );
        
        return hasil;
    }
}