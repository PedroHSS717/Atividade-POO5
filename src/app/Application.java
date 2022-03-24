package app;

import java.util.Scanner;

import entites.ContaCorrente;
import entites.ContaPoupança;

public class Application {

	
		
		static Scanner ent = new Scanner(System.in);
		public static void main(String[] args) {
			Scanner scan = new Scanner (System.in);
			int opcao;
			Double sacar, depositar;
		
			
			ContaPoupança pp = new ContaPoupança("Pedro Sampaio", 334456, 68000.00);
			System.out.println(pp.toString());
			
			System.out.println("1. Depositar");
			System.out.println("2. Sacar");
			opcao = scan.nextInt();
			
			switch(opcao) {
			case 1: System.out.println("Digite o valor desejado para o deposito: ");
			depositar = scan.nextDouble();
			pp.depositar(depositar);
			System.out.println(pp.toString());
			break;
			case 2: System.out.println("Digite o valor desejado para o saque: ");
			sacar = scan.nextDouble();
			pp.sacar(sacar);
			System.out.println(pp.toString());
			break;
			default: System.out.println("Errado.");
			} 
			
			ContaCorrente cc = new ContaCorrente("Pedro Sampaio",334456, 68000.00);
			System.out.println(cc.toString());
			
			System.out.println("1. Depositar");
			System.out.println("2. Sacar");
			opcao = scan.nextInt();
			
			switch(opcao) {
			case 1: System.out.println("Digite o valor desejado para o depósito: ");
			depositar = scan.nextDouble();
			cc.depositar(depositar);
			System.out.println(pp.toString());
			break;
			case 2: System.out.println("Digite o valor desejado para o saque: ");
			sacar = scan.nextDouble();
			cc.sacar(sacar, (sacar * 0.2));
			System.out.println(cc.toString());
			break;
			default: System.out.println("Errado.");
			}
			
			
		}

}
