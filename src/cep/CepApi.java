package cep;

import projeto.singleton.ContaBancaria;

public class CepApi {

	  // Método estático para obter a única instância da classe
	private static CepApi instancia = new CepApi();
    public static CepApi getInstancia() {
        if (instancia == null) {
            instancia = new CepApi();
        }
        return instancia;
    }
    
    public String recuperarCidade(String cidade) {
    	return "Sao Paulo";
    	
    }
    
    public String recuperarEstado(String Estado) {
    	return "Sao Paulo";
    }
}
