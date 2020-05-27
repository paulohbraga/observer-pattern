package subject;
import java.util.ArrayList;
import interfaces.Observer;
import interfaces.Subject;

public class AdminSujeito implements Subject {
	
	public String mensagem = "Nulo";
	ArrayList<Observer> observers = new ArrayList<>();

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
	@Override
	public void adicionar(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void remover(Observer o) {
		observers.remove(o);
		
	}


	@Override
	public void notificarTodos() {
		for (Observer observer : observers) {
			observer.atualizar(this);
		}
		
	}

}
