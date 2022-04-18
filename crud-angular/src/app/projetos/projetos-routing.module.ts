import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddComponent } from './add/add.component';
import { ProjetosComponent } from './projetos/projetos.component';

const routes: Routes = [
  { path: '', component: ProjetosComponent },
  { path: 'add-project', component: AddComponent,
    data: {
      title: 'ADD PAINEL'
    },
    outlet: "projeto"
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProjetosRoutingModule { }
