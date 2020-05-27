package programa;

import observers.JoaoObserver;
import observers.MariaObserver;
import subject.AdminSujeito;

public class Main {
	
    public static void main(String[] args) throws Exception {
	
    	AdminSujeito adminSujeito = new AdminSujeito();

    	MariaObserver mariaObserver = new MariaObserver();    	
    	JoaoObserver joaoObserver = new JoaoObserver();    	
   	
    	adminSujeito.adicionar(mariaObserver);
    	adminSujeito.adicionar(joaoObserver);
    	
    	System.out.println(adminSujeito.getMensagem());
    	System.out.println(mariaObserver.getMensagem());
    	System.out.println(joaoObserver.getMensagem());

    	
    	adminSujeito.setMensagem("Mensagem enviada pelo Sujeito");
    	
    	adminSujeito.notificarTodos();
    	
    	System.out.println(adminSujeito.getMensagem());
    	System.out.println(mariaObserver.getMensagem());
    	System.out.println(joaoObserver.getMensagem());

	}
	

}
