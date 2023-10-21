package Iphone;

import Iphone.navegador_internet.Navegador;
import Iphone.navegador_internet.Safari;

public class Iphone extends IOS {
 
    
	
	public static void main(String[] args) {
		Iphone iphone10 = new Iphone();
		
		// testando os métodos do telefone
		System.out.println("Fazer ligação");
		iphone10.ligar();
		System.out.println("Atender ");
		iphone10.atender();
		System.out.println("Iniciar correio de voz");
		iphone10.iniciarCorreioVoz();
		
		// testando os métodos do reprodutor musical
		
		System.out.println("Selecionar Musica");
		iphone10.selecionarMusica();
		System.out.println("Tocar musica");
		iphone10.tocar();
		System.out.println("Pausar musica");
		iphone10.pausar();
		
		
		// testando os métodos do Navegador
		
		System.out.println("Adicionar nova aba");
		iphone10.adiconarNovaAba();
		System.out.println("Exibir a pagina");
		iphone10.exibirPagina();
		System.out.println("Atualizar pagina");
		iphone10.atualizarPagina();
		
		
		
		
		
		
	}
}
