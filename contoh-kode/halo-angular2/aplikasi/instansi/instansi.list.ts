import {Component} from 'angular2/core';

import {Instansi} from './instansi';
import {InstansiService} from './instansi.service';

@Component({
    templateUrl: './aplikasi/instansi/instansi.list.html',
    selector: '<instansi-list>'
})
export class InstansiList {
    constructor(private instansiService: InstansiService){ }
    
    get daftarInstansi(){
        return this.instansiService.daftarInstansi;
    }
}