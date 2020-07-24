import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {BuchlisteComponent} from "./buchliste/buchliste.component";

const routes: Routes = [
  {path: 'buecher', component: BuchlisteComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
