package projeto.Strategy;

public class Usuario {
	
	private Operacao operacao;

	// metodo set para informar qual é a operação
	public void setOperacao(Operacao operacao) {
		this.operacao = operacao;
	}
	
	public  void operacao() {
		operacao.operacao();
	}
	

}
