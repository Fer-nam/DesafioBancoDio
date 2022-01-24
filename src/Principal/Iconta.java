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
public interface Iconta {
    
     void sacar( double valor);
    
     void depositar(double valor);
    
     void transferir(double valor, Conta  contaDestino);
    
     void imprimirExtrato();
}
