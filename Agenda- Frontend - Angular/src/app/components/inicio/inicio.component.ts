import { Component, OnInit } from '@angular/core';
import { environment } from 'src/environments/environment';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-inicio',
  templateUrl: './inicio.component.html',
  styleUrls: ['./inicio.component.css']
})
export class InicioComponent implements OnInit {

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }

  public generarAgenda() {

    this.http.get(`${environment.baseUrl}/asignacion`).subscribe(
      result => {
        alert('Agenda creada')
        return result},
      error => alert('No se puedo crear agenda'))

    }
  
}
