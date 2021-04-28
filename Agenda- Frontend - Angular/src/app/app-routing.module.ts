import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AgendaComponent } from './components/agenda/agenda.component';
import { EmpresasComponent } from './components/empresas/empresas.component';
import { InicioComponent } from './components/inicio/inicio.component';

const routes: Routes = [
  { path: 'inicio', component: InicioComponent},
  {path: 'empresas', component: EmpresasComponent},
  { path: 'agenda', component: AgendaComponent},
  { path: '', pathMatch: 'full', redirectTo: '/inicio'},
  { path: '**', pathMatch: 'full', redirectTo: '/inicio'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
