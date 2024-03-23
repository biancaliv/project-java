/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sp300lab
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        List<Pessoa> funcionarios = new ArrayList<>();
        funcionarios.add(new Motorista("78494", "2335", "145697", "2029", "Charles", "4002892219", "Rua Lua Lua, 85", "3693969"));
        funcionarios.add(new Medico("4854", "888888", "6356", "Pediatra", "Bianca", "Rua 1435", "45455665","546345524"));
        funcionarios.add(new Enfermeiro("4646", "156744", "87487", "Ulisses", "654644154", "Rua 6385","567897465"));
                
                
            for (Pessoa funcionario : funcionarios) {
            double salario= funcionario.calculoSalario();
            System.out.println("Funcionário: " + funcionario.getNome());
            System.out.println("Salário: " + salario);
        }
    }

   
      
}
