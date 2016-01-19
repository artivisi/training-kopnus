import {Component} from 'angular2/core';
import {RouteConfig, ROUTER_DIRECTIVES} from 'angular2/router';

import {Halo} from './halo/halo.component';
import {Instansi} from './instansi/instansi.component';
import {Peserta} from './peserta/peserta.component';
import {Kelas} from './kelas/kelas.component';

@Component({
    selector: "aplikasi",
    templateUrl: './aplikasi/aplikasi.html',
    directives: [ROUTER_DIRECTIVES]
})
@RouteConfig([
    {path:'/', name: 'Halo', component: Halo, useAsDefault: true},
    {path:'/instansi', name: 'Instansi', component: Instansi},
    {path:'/peserta', name: 'Peserta', component: Peserta},
    {path:'/kelas', name: 'Kelas', component: Kelas}
])
export class Aplikasi {}