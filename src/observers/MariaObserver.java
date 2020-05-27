package observers;

import interfaces.Observer;
import subject.AdminSujeito;

public class MariaObserver implements Observer {


	public String mensagem = "Nulo";
	
	
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	@Override
	public void atualizar(AdminSujeito adminSujeito) {
		mensagem = adminSujeito.getMensagem();
		
	}
	
}
