import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Projeto } from '../model/projeto';
import { first } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class ProjetosService {

  private readonly API = 'api/projetos';

  constructor(private httpClient: HttpClient) { }

  listAllProjetos() {
    return this.httpClient.get<Projeto[]>(this.API + "/list")
    .pipe(
      first()
    );
  }

  addProjeto(project: Projeto) {
    return this.httpClient.post<Projeto>(this.API + "/add", project);
  }

  deleteProjetoById(id: string) {
    return this.httpClient.delete(this.API + "/{id}")
  }

}
