package Iphone.aparelho_telefonico;

public class Phone implements Telefone{

	private String ligar ="Ligando pelo telefone ..";
	private String atender = "Atendendo pelo telefone..";
	private String iniciarCorreioVoz = "Iniciando correio de voz..";
	
	// gettes
	public String getLigar() {
		return ligar;
	}

	public String getAtender() {
		return atender;
	}

	public String getIniciarCorreioVoz() {
		return iniciarCorreioVoz;
	}

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		getLigar();
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		getAtender();
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		getIniciarCorreioVoz();
	}

}
