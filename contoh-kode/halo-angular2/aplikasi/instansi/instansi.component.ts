import {Component} from 'angular2/core';

import {Instansi} from './instansi';
import {InstansiForm} from './instansi.form';
import {InstansiList} from './instansi.list';
import {InstansiService} from './instansi.service';

@Component({
    templateUrl: './aplikasi/instansi/instansi.html',
    directives: [InstansiForm, InstansiList]
})
export class InstansiComponent{ }