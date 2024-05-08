import { Component } from '@angular/core';
import { Howl } from 'howler';

@Component({
  selector: 'app-siren',
  templateUrl: './siren.component.html',
  styleUrl: './siren.component.css'
})
export class SirenComponent {
  audio: HTMLAudioElement;

  constructor() {
    this.audio = new Audio();
    this.audio.src = 'path/to/your/audio/file.mp3';
  }

  playAudio() {
    this.audio.play();
  }
}
