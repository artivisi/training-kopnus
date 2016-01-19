import {Component} from 'angular2/core';

import {Instansi} from './instansi';
import {InstansiService} from './instansi.service';

@Component({
    templateUrl: './aplikasi/instansi/instansi-form.html',
    selector: '<instansi-form>'
})
export class InstansiForm {
    instansi: Instansi = new Instansi("", "");
    
    constructor(private instansiService: InstansiService){}
    
    onSubmit(){
        this.instansiService.simpan(this.instansi);
        this.instansi = new Instansi("", "");
    }
}