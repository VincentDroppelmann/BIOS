import {Component, OnInit} from '@angular/core';
import {Buch, BuchService} from "../buch.service";

@Component({
  selector: 'app-buchliste',
  templateUrl: './buchliste.component.html',
  styleUrls: ['./buchliste.component.scss']
})
export class BuchlisteComponent implements OnInit {

  buecher: Buch[];
  laedt: boolean;

  constructor(private buchservice: BuchService) {
  }

  async ngOnInit() {
    this.laedt = true
    this.buecher = await this.buchservice.getBuecher()
    this.laedt = false
  }

}
