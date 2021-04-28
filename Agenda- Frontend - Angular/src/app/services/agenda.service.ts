import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import {Usuario} from '../Interfaces/Usuario.interface'
import {Agente} from '../Interfaces/Agente.interface';
import { Asignacion } from '../Interfaces/Asignacion.interface';

@Injectable({
  providedIn: 'root'
})
export class AgendaService {

  constructor(private http:HttpClient) { }

  //retorna toda la información del usuario(cliente)
  getUser(id:number){
    return this.http.get<Usuario>(`${environment.baseUrl}/usuario?USER_ID=${id}`)
  }
  //Devuelve la lista de los agentes asginados en el día de hoy
  getListaAgentes(){
    return this.http.get<Usuario[]>(`${environment.baseUrl}/asignados`)
  }
  //Devuelve los id de los usuarios que fueron asignados al agente
  getAgenda(id:number){
  return this.http.get<Usuario[]>(`${environment.baseUrl}/agenda?AGENTE_ID=${id}`)
  }


}
