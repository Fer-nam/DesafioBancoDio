/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author ferna
 */
public class contaPoupanca extends Conta {

    public contaPoupanca(cliente cli) {
        super(cli);
    }

    

    
    public void imprimirExtrato(){
       System.out.println("=== Extrato conta Poupança === ");
     super.imprimirInfoComuns();
   }
    
  
    
}
