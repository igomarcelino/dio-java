package projeto;

import projeto.Strategy.ConsultarSaldo;
import projeto.Strategy.Depositar;
import projeto.Strategy.Operacao;
import projeto.Strategy.Usuario;
import projeto.facede.MigrarCliente;
import projeto.singleton.ContaBancaria;

public class Projeto {

	public static void main(String[] args) {
		
		
		
		ContaBancaria contaUser1 = ContaBancaria.getInstancia();
		
		
		// utilizando o método para depositar na conta
		
		contaUser1.depositar(140);
		
		
		
		// imprimindo o saldo atual
		
		System.out.println("Saldo : R$" + contaUser1.consultarSaldo() );
		
		// Validando se o pattern singleton foi aplicado corretamente
		
		ContaBancaria contaUser2 = ContaBancaria.getInstancia();
		
		if(contaUser1 == contaUser2) {
			System.out.println("As duas contas são iguais ");
		}
		else {
			contaUser2.depositar(150);
			System.out.println("Saldo: R$" + contaUser2.consultarSaldo());
		}
		
		// Strategy
		
		Operacao deposito = new Depositar();
		Operacao consultarSaldo = new ConsultarSaldo();
		
		Usuario usuario1 = new Usuario();
		
		usuario1.setOperacao(deposito);
		usuario1.operacao();
		System.out.print(contaUser1+"\n");
		usuario1.setOperacao(consultarSaldo);
		usuario1.operacao();
		System.out.println(contaUser1);
		
		
		// facede
		
		MigrarCliente facede = new MigrarCliente();
		facede.migrarCliente("Joao", "19748999");
	}
	
	
	
	
		
		
	
	
	
}
