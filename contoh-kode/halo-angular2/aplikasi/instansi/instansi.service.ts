import {Injectable} from 'angular2/core';
import {Http, Response} from 'angular2/http';
import 'rxjs/Rx';
import {Instansi} from './instansi';

@Injectable()
export class InstansiService {
    _serverUrl: string = "/api/institusi/";
    
    constructor(private serverApi: Http){}
    
    getDaftarInstansi(){
        return this.serverApi.get(this._serverUrl)
                   .map((res: Response) => res.json());
    }
    
    simpan(instansi: Instansi){
        console.log('belum dibuat');
    }
}