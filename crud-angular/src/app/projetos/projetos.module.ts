import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MatCardModule } from '@angular/material/card';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatIconModule } from '@angular/material/icon';
import { MatTableModule } from '@angular/material/table';
import { MatToolbarModule } from '@angular/material/toolbar';
import { SharedModule } from '../shared/shared.module';
import { AddComponent } from './add/add.component';
import { ProjetosRoutingModule } from './projetos-routing.module';
import { ProjetosComponent } from './projetos/projetos.component';



@NgModule({
  declarations: [
    ProjetosComponent,
    AddComponent
  ],
  imports: [
    CommonModule,
    ProjetosRoutingModule,
    MatTableModule,
    MatCardModule,
    MatToolbarModule,
    SharedModule,
    MatIconModule,
    MatFormFieldModule,
    FormsModule, 
    ReactiveFormsModule,
    MatDatepickerModule
  ]
})
export class ProjetosModule { }
