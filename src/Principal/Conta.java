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
public abstract class Conta implements Iconta {
    protected static final int AGENCIA_PADRAO = 1;
    
    private static int SEQUENCIAL = 1;
    
    protected int agencia, numero;
    protected  double saldo;
    protected cliente cli;
   

    public Conta(cliente cli) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cli = cli;
       
       
    }
    
   

    @Override
    public void sacar(double valor){
        saldo -= valor;
    }
    
   
    @Override
    public void depositar(double valor){
        saldo += valor;
    }
    

    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
      protected void imprimirInfoComuns(){
         System.out.println(String.format("Titular %s", this.cli.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format(" Saldo: %.2f", this.saldo));
    }
}
