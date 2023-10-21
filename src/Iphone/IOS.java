package Iphone;

import Iphone.aparelho_telefonico.Phone;
import Iphone.aparelho_telefonico.Telefone;
import Iphone.navegador_internet.Navegador;
import Iphone.navegador_internet.Safari;
import Iphone.reprodutor_musical.AppMusic;
import Iphone.reprodutor_musical.Musica;

public abstract class IOS implements Musica, Navegador, Telefone {

	// objetos
	AppMusic appMusic = new AppMusic();
	Safari safari = new Safari();
	Phone telefone = new Phone();
	
	
	// reprodutor musical
	@Override
	public void tocar () {
		// TODO Auto-generated method stub
		
		System.out.println(appMusic.getTocar());
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		
		System.out.println(appMusic.getPausar());
		
	}

	@Override
	public void selecionarMusica() {
		// TODO Auto-generated method stub
		
		System.out.println(appMusic.getSelecionarMusica());
	}

	// navegador de internet
	
	@Override
	public void adiconarNovaAba() {
		// TODO Auto-generated method stub
	
		System.out.println(safari.getNovaAba());
		
		
	}
	
	@Override
	public void exibirPagina() {
		// TODO Auto-generated method stub
		System.out.println(safari.getExibirPagina());
	}
	
	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println(safari.getAtualizarPagina());
	}
	
	// telefone
	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		System.out.println(telefone.getLigar());
	}
	
	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println(telefone.getAtender());
	}
	
	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println(telefone.getIniciarCorreioVoz());
	}
	
	
}
