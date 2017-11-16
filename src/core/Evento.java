package core;

public class Evento
{
	public void confirmarEvento(Usuario usuario, Evento evento){
		usuario.setEventosConfirmados(evento);
	}

}
