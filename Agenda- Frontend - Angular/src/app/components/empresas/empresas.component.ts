import { Component, OnInit } from '@angular/core';
import { Empresa } from 'src/app/Interfaces/Empresa.interface';
import {Agente} from 'src/app/Interfaces/Agente.interface'
import { ParamEmpresa } from 'src/app/Interfaces/ParamEmpresa.interface';
import { EmpresaService } from 'src/app/services/empresa.service';
import {take} from 'rxjs/operators'

@Component({
  selector: 'app-empresas',
  templateUrl: './empresas.component.html',
  styleUrls: ['./empresas.component.css']
})
export class EmpresasComponent implements OnInit {

  empresa1: Empresa;
  empresa2: Empresa;
  paramEmpresa: ParamEmpresa[] = [];
  agentes: Agente[] = [];
  constructor(private empresaService: EmpresaService) {}

  ngOnInit(): void {
    this.getDataEmpresa();
  }
  
  private getDataEmpresa(): void{
    this.empresaService.searchEmpresa(1)
    .pipe(take(1))
    .subscribe((res: any) =>{
      this.empresa1 = res[0];
      
    });
    this.empresaService.searchEmpresa(2)
    .pipe(take(1))
    .subscribe((res: any) =>{
      this.empresa2 = res[0];
  });
}

  public getDataPramEmpresa(id:number): void{
    this.empresaService.searchParamEmpresa(id)
    .pipe(take(1))
    .subscribe((res: any) =>{
      this.paramEmpresa = res;
    });
  }

  public getAgentes(id:number):void{
    this.empresaService.getAgente(id)
    .pipe(take(1))
    .subscribe((res: any) =>{
      this.agentes = res;
    });
  }
}
