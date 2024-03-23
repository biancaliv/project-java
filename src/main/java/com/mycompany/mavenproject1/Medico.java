/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author sp300lab
 */
public class Medico extends Pessoa{
    private String crm;
    private String numPis;
    private String carteiraTrabalho;
     private String especializacao;

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getNumPis() {
        return numPis;
    }

    public void setNumPis(String numPis) {
        this.numPis = numPis;
    }

    public String getCarteiraTrabalho() {
        return carteiraTrabalho;
    }

    public void setCarteiraTrabalho(String carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public Medico(String crm, String numPis, String carteiraTrabalho, String especializacao, String nome, String cpf, String endereco, String telefone) {
        super(nome, cpf, endereco, telefone);
        this.crm = crm;
        this.numPis = numPis;
        this.carteiraTrabalho = carteiraTrabalho;
        this.especializacao = especializacao;
    }
   
    @Override
public double calculoSalario() {
       double salario = 7000;
    return salario * 0.75;
}
}
