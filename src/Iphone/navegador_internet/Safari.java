package Iphone.navegador_internet;

public  class Safari implements Navegador{
	
	private String novaAba = "Nova aba adicionada no Safari..";
	private String exibirPagina = "Pagina sendo exibida no Safari..";
	private String atualizarPagina = "Atualizando a pagina no Safari..";
	
	// getters
	
	public String getNovaAba() {
		return novaAba;
	}
	
	public String getExibirPagina() {
		return exibirPagina;
	}

	public String getAtualizarPagina() {
		return atualizarPagina;
	}

	// Métodos implementados
	
	@Override
	public void adiconarNovaAba() {
		// TODO Auto-generated method stub
		// adicionando a nova aba
		getNovaAba();
	}

	@Override
	public void exibirPagina() {
		// TODO Auto-generated method stub
		// exibindo a pagina
		getExibirPagina();
	}
	
	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		// Atualizar a pagina
		getAtualizarPagina();
	}

	
}
