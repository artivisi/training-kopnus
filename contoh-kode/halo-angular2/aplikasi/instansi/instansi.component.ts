import {Component} from 'angular2/core';

import {Instansi} from './instansi';

@Component({
    templateUrl: './aplikasi/instansi/instansi.html'
})
export class InstansiComponent{
    
    daftarInstansi = [
        new Instansi("AI-001", "ArtiVisi Intermedia"),
        new Instansi("CMS-001", "PT. CMS")
    ];
    
}