import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class BuchService {

  constructor(private http: HttpClient) { }

  getBuecher() {
    return this.http.get<Buch[]>("/api/buecher").toPromise()
  }

  getBuch(titel: string) {
    return this.http.get<Buch>(`/api/buch?titel=${titel}`).toPromise()
  }
}

export interface Buch {
  id: string
  titel: string
}
