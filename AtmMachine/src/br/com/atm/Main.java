package br.com.atm;

import java.util.Random;
import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		int tecla;
		int teclaMenu;
		double teclaSaque;
		double teclaDeposito;
	    String nomeCliente;
	    String email;
		int rangePin = 100;
		boolean condicao=true;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in); //scanner da tecla
		Scanner sc1 = new Scanner(System.in);//scanner do nome
		Scanner sc2 = new Scanner(System.in);//scanner do email
		Scanner sc3 = new Scanner(System.in);//scanner do menu
		Scanner sc4 = new Scanner(System.in);//scanner do valor de deposito
		Scanner sc5 = new Scanner(System.in);//scanner do valor de saque
		
				
		
		do {
			
			System.out.println("------Bem vindo ao Banco Digital--------");
			System.out.println("Tecle 1 --- para cadastrar um usuario:"); 
			System.out.println("Tecle 2 --- para Sair:");
			tecla = sc.nextInt();
			
			if(tecla == 1) {
				System.out.println("\n");
				System.out.print("Digite um nome:");
				nomeCliente = sc1.nextLine();
				System.out.print("\n");
				System.out.print("Digite seu email:");
				email = sc2.nextLine();
				Titular nome = new Titular(nomeCliente,email);
				int random = rand.nextInt(rangePin);
				Conta conta = new Conta(random,nome);
				boolean condicao1=true;
				while(condicao1) {
					System.out.println("---Menu de informações---");
					System.out.println("Tecle 1 para Saldo");
					System.out.println("Tecle 2 para Deposito");
					System.out.println("Tecle 3 para Saque");
					System.out.println("Tecle 4 para Extrato");
					System.out.println("Tecle 5 para Sair");
					teclaMenu=sc3.nextInt();
			
					switch(teclaMenu) {
				
					case 1:
						System.out.println("Seu saldo é:"+conta.getsaldo());
						break;
						
					
					case 2:
						System.out.print("Digite o valor de Deposito: "+"\n");
						teclaDeposito = sc4.nextDouble();
						if(teclaDeposito > 0) {
							conta.depositar(teclaDeposito);
							break;
						}
						else {
							System.out.println("Valor de deposito incorreto");
							break;
						}
						
				
					case 3:
						System.out.print("Digite o valor de Saque: "+"\n");
						teclaSaque = sc5.nextDouble();
						if(conta.getsaldo() >= teclaSaque) {
							conta.sacar(teclaSaque);
							break;
						}
						else {
							System.out.println("Fundos insuficientes");
							break;
						}
					case 4:
						conta.extrato();
						break;
				
					case 5:
						System.out.println("Até Breve!!!");
						condicao1 = false;
						break;
				
					default:
						System.out.print("Numero escolhido está invalido");
						break;
						
					}
				}
			
				
				}else if(tecla == 2) {
					System.out.print("Até Breve!");
					condicao=false;
			
				}else {
					System.out.print("Numero digitado está incorreto");
					System.out.print("\n");
					System.out.print("\n");
				}
		
		}while(condicao);
		
		

	}

}
