/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;

/**
 *
 * @author 029181066
 */
public class Consulta {
    private String especialidade, dataConsulta, problema, diagnostico;
    private float valCons;

    public Consulta(String especialidade, String dataConsulta, String problema, String diagnostico, float valCons) {
        this.especialidade = especialidade;
        this.dataConsulta = dataConsulta;
        this.problema = problema;
        this.diagnostico = diagnostico;
        this.valCons = valCons;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public float getValCons() {
        return valCons;
    }

    public void setValCons(float valCons) {
        this.valCons = valCons;
    }    
}