import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ErrorDialogComponent } from './components/error-dialog/error-dialog.component';
import {MatDialogModule} from '@angular/material/dialog';
import {MatButtonModule} from '@angular/material/button';
import { RiskPipe } from './pipes/risk.pipe';


@NgModule({
  declarations: [
    ErrorDialogComponent,
    RiskPipe
  ],
  imports: [
    MatDialogModule,
    CommonModule,
    MatButtonModule
  ],
  exports: [
    ErrorDialogComponent,
    RiskPipe
  ]
})
export class SharedModule { }
