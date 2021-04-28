import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { Empresa } from '../Interfaces/Empresa.interface';
import { Agente } from '../Interfaces/Agente.interface';
import { ParamEmpresa } from '../Interfaces/ParamEmpresa.interface';

@Injectable({
  providedIn: 'root'
})
export class EmpresaService {

  constructor(private http:HttpClient) { }

  //Se obtiene la lista de parámetros de la empresa (los clientes que puede atender)
  searchParamEmpresa(id:number){
    return this.http.get<ParamEmpresa[]>(`${environment.baseUrl}/parametros/empresa?EMPRESA_ID=${id}`)
  }
  //Obtener la informacion general de la empresa
  searchEmpresa(id:number){
    return this.http.get<Empresa[]>(`${environment.baseUrl}/empresa?EMPRESA_ID=${id}`)
  }
  //Develve la lista de agentes que pertenecen a la empresa
  getAgente(id:number){
    return this.http.get<Agente[]>(`${environment.baseUrl}/agentes?EMPRESA_ID=${id}`)
  }
}
