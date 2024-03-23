/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author sp300lab
 */
public class Motorista extends Pessoa{
   private String carteiraTrabalho;
   private String numPis;
   private String habilitacao;
   private String vencimentoHabilitacao;

    public String getCarteiraTrabalho() {
        return carteiraTrabalho;
    }

    public void setCarteiraTrabalho(String carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }

    public String getNumPis() {
        return numPis;
    }

    public void setNumPis(String numPis) {
        this.numPis = numPis;
    }

    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }

    public String getVencimentoHabilitacao() {
        return vencimentoHabilitacao;
    }

    public void setVencimentoHabilitacao(String vencimentoHabilitacao) {
        this.vencimentoHabilitacao = vencimentoHabilitacao;
    }

    public Motorista(String carteiraTrabalho, String numPis, String habilitacao, String vencimentoHabilitacao, String nome, String cpf, String endereco, String telefone) {
        super(nome, cpf, endereco, telefone);
        this.carteiraTrabalho = carteiraTrabalho;
        this.numPis = numPis;
        this.habilitacao = habilitacao;
        this.vencimentoHabilitacao = vencimentoHabilitacao;
    }
   
@Override
public double calculoSalario() {
       double salario = 5000;
    return salario * 0.85;
}
}
