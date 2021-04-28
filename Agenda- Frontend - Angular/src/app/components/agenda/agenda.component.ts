import { Component, OnInit  } from '@angular/core';
import { Usuario } from 'src/app/Interfaces/Usuario.interface';
import { AgendaService } from 'src/app/services/agenda.service';
import {EmpresaService} from 'src/app/services/empresa.service';
import {take} from 'rxjs/operators'
import { Agente } from 'src/app/Interfaces/Agente.interface';
import { Asignacion } from 'src/app/Interfaces/Asignacion.interface';



@Component({
  selector: 'app-agenda',
  templateUrl: './agenda.component.html',
  styleUrls: ['./agenda.component.css']
})
export class AgendaComponent implements OnInit {

  usuarios: Usuario[];
  idAgentes: Agente[];
  agentes: Agente[];
  optionselected: string = '0';
  asginacion: Asignacion[];
  constructor(private agendaService: AgendaService, private empresaService: EmpresaService) { }

  ngOnInit(): void {
    this.getlista();

  }


  public getlista(): void{
    this.agendaService.getListaAgentes()
    .pipe(take(1))
    .subscribe((res: any) =>{
      this.idAgentes = res;
    });
  }

  public getAgentes(id:number):void{
    this.empresaService.getAgente(id)
    .pipe(take(1))
    .subscribe((res: any) =>{
      this.agentes = res;

    });
  }

  public getAsignacion(id:number):void{
    this.agendaService.getAgenda(id)
    .pipe(take(1))
    .subscribe((res: any) =>{
      this.asginacion = res;
    });
  }

  public getUser(id:number):void{
    this.agendaService.getAgenda(id)
    .pipe(take(1))
    .subscribe((res: any) =>{
      this.usuarios = res;
    });
  }

  public getEvent():void{
    for (let agente of this.idAgentes){
      if (agente.nombre == this.optionselected){
        this.getUser(agente.id_AGENTE);
      }
    }
  }
 
}
