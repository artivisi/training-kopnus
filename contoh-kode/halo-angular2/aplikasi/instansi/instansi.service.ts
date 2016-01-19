import {Instansi} from './instansi';

export class InstansiService {
    _daftarInstansi = [
        new Instansi("AI-001", "ArtiVisi Intermedia"),
        new Instansi("CMS-001", "PT. CMS")
    ];
    
    get daftarInstansi(){
        return this._daftarInstansi;
    }
}