import {Component} from 'angular2/core';

import {Instansi} from './instansi';
import {InstansiForm} from './instansi.form';
import {InstansiService} from './instansi.service';

@Component({
    templateUrl: './aplikasi/instansi/instansi.html',
    directives: [InstansiForm]
})
export class InstansiComponent{
    
    constructor(private instansiService: InstansiService){ }
    
    get daftarInstansi(){
        return this.instansiService.daftarInstansi;
    }
    
}