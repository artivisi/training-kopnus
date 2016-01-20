import {Component} from 'angular2/core';
import {RouteConfig, ROUTER_DIRECTIVES} from 'angular2/router';

import {Halo} from './halo/halo.component';
import {InstansiComponent} from './instansi/instansi.component';
import {Peserta} from './peserta/peserta.component';
import {Kelas} from './kelas/kelas.component';
import {AuthComponent} from './auth/auth.component';

@Component({
    selector: "aplikasi",
    templateUrl: './aplikasi/aplikasi.html',
    directives: [ROUTER_DIRECTIVES, AuthComponent]
})
@RouteConfig([
    {path:'/', name: 'Halo', component: Halo, useAsDefault: true},
    {path:'/instansi', name: 'Instansi', component: InstansiComponent},
    {path:'/peserta', name: 'Peserta', component: Peserta},
    {path:'/kelas', name: 'Kelas', component: Kelas}
])
export class Aplikasi {}