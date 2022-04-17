import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { catchError, Observable, of } from 'rxjs';
import { ErrorDialogComponent } from 'src/app/shared/components/error-dialog/error-dialog.component';
import { Projeto } from '../model/projeto';
import { ProjetosService } from '../services/projetos.service';

@Component({
  selector: 'app-projetos',
  templateUrl: './projetos.component.html',
  styleUrls: ['./projetos.component.scss']
})
export class ProjetosComponent implements OnInit {

  projetos: Observable<Projeto[]>;
  displayedColumns = ['name','startDate','endDate','projectValue', 'risk'];

  constructor(
    private projetosService: ProjetosService,
    public dialog: MatDialog
    ) {
    this.projetos = this.projetosService.list()
    .pipe(
      catchError(error => {
        this.onError('Error ao carregar os projetos');
        return of([])
      })
    );
   }

   onError(errorMsg: string) {
    this.dialog.open(ErrorDialogComponent, {
      data: errorMsg
    });
  }

  ngOnInit(): void {
  }

}
