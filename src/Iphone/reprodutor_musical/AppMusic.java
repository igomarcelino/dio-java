package Iphone.reprodutor_musical;

public class AppMusic implements Musica{
	
	private String tocar = "MÚsica tocando pelo APP MUSIC ..";
	private String pausar = "Pausando a música no APP MUSIC..";
	private String selecionarMusica = "Selecionando a música no APP MUSIC";

	// getters
	public String getTocar() {
		return tocar;
	}

	public String getPausar() {
		return pausar;
	}

	public String getSelecionarMusica() {
		return selecionarMusica;
	}

	// métodos sobrescritos 
	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		getTocar();
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		getPausar();
		
	}

	@Override
	public void selecionarMusica() {
		// TODO Auto-generated method stub
		getSelecionarMusica();
	}

	
}
