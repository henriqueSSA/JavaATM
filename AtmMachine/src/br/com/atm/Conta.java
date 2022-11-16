package br.com.atm;

public class Conta {
	private double saldo;
    private int pin;
    private Titular cliente;
    private double valorDeposito;
    private double valorSaque;
    private static int quantidadeContas=0;
    
    public Conta(int pin, Titular cliente){
        this.pin = pin;
        this.cliente = cliente;
        this.saldo = 0.0;
        this.valorDeposito = 0.0;
        this.valorSaque = 0.0;
        quantidadeContas++;
        System.out.print("Conta criada com Sucesso!!!\n");
    }
    
    public double getsaldo(){
        return saldo;
    }
    
    public void depositar(double valorDeposito){
        this.saldo += valorDeposito;
        this.valorDeposito = valorDeposito;
    }
    
    public void sacar(double valorSaque){
        this.saldo -= valorSaque;
        this.valorSaque = valorSaque;
    }
    
    
    
    public void extrato(){
        System.out.println("---- Informações da sua conta ----");
        System.out.println("Seu nome é: "+cliente.getNome());
        System.out.println("Seu email é: "+cliente.getEmail());
        System.out.println(this.valorDeposito+" Depositado");
        System.out.println(this.valorSaque+" Sacado");
        System.out.println(getsaldo()+" Saldo em conta");
        System.out.println("-----------------------------------");
        
    }

}
