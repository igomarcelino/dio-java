package projeto.facede;

import cep.CepApi;
import crm.Crm;

public class MigrarCliente {

	public void migrarCliente(String nome,String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		Crm.migrarCliente(nome, cep, cidade, estado);
		
		System.out.println(nome);
		System.out.println(cep);
		System.out.println(cidade);
		System.out.println(estado);
	}
}
