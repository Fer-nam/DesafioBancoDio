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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       cliente venilton = new cliente();
       venilton.setNome("Venilton");
        
       Conta cc = new contaCorrente(venilton);
       Conta poupanca = new contaPoupanca(venilton);
        
         
        
      cc.depositar(100);
      cc.transferir(100, poupanca);
      
      cc.imprimirExtrato();
      poupanca.imprimirExtrato();
       
        
    }
    
}
