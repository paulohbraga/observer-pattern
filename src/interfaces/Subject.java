package interfaces;
public interface Subject {
	
	void adicionar(Observer o);
	void remover(Observer o);
	void notificarTodos();

}
