import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class WetterService {

  constructor(private http: HttpClient) { }

  getWetter() {
    return this.http.get<Wetter[]>("/api/wetter");
  }
}

export interface Wetter {
    stadt: string;
    temperatur: number;
}
