import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Projeto } from '../model/projeto';
import { first } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class ProjetosService {

  private readonly API = '';

  constructor(private httpClient: HttpClient) { }

  list() {
    return this.httpClient.get<Projeto[]>(this.API)
    .pipe(
      first()
    );
  }

}
