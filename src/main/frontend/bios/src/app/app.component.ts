import { Component } from '@angular/core';
import {Wetter, WetterService} from "./wetter.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'BIOS';
  wetters: Wetter[]

  constructor(private service: WetterService) {
    this.service.getWetter()
      .subscribe(w => this.wetters = w);
  }
}
