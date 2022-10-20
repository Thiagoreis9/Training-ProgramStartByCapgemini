import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-segundo-componente',
  templateUrl: './segundo-componente.component.html',
  styleUrls: ['./segundo-componente.component.css']
})
export class SegundoComponenteComponent {
  nome = "Thiago";
  dataNascimento = "2000-06-22";
  urlImagem = "/assets/IMG-5274-removebg.png";

  mostrarDataNascimento(){
    alert('A data de nascimento do Thiago é: ' + this.dataNascimento);
  }
}
