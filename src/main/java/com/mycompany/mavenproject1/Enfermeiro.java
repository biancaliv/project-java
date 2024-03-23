/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author sp300lab
 */
public class Enfermeiro extends Pessoa{
    private String numPis;
    private String carteiraTrabalho;
    private String numCoren;

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

    public String getNumCoren() {
        return numCoren;
    }

    public void setNumCoren(String numCoren) {
        this.numCoren = numCoren;
    }

    public Enfermeiro(String numPis, String carteiraTrabalho, String numCoren, String nome, String cpf, String endereco, String telefone) {
        super(nome, cpf, endereco, telefone);
        this.numPis = numPis;
        this.carteiraTrabalho = carteiraTrabalho;
        this.numCoren = numCoren;
    }
    
    @Override
public double calculoSalario() {
       double salario = 5000;
    return salario * 0.80;
}
    
}
