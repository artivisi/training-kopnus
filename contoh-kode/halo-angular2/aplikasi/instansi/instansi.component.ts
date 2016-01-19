import {Component} from 'angular2/core';

import {Instansi} from './instansi';
import {InstansiService} from './instansi.service';

@Component({
    templateUrl: './aplikasi/instansi/instansi.html'
})
export class InstansiComponent{
    
    private _instansiService: InstansiService;
    
    constructor(instansiService: InstansiService){
        this._instansiService = instansiService;
    }
    
    get daftarInstansi(){
        return this._instansiService.daftarInstansi;
    }
    
}