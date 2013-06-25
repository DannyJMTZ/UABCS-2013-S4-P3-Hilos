import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Hilo {
	
	public static void main(String[] args) {
		
		/*Thread hilo1 = new Thread( new PrintTask("Tarea1") );
		Thread hilo2 = new Thread( new PrintTask("Tarea2") );
		Thread hilo3 = new Thread( new PrintTask("Tarea3") );
		
		System.out.println("Subprocesos Creados");
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
		
		System.out.println("Tareas iniciadas");
		*/
		
		ExecutorService ejecutorSubprocesos = Executors.newCachedThreadPool();
		
		ejecutorSubprocesos.execute( new PrintTask("Tarea1") );
		ejecutorSubprocesos.execute( new PrintTask("Tarea2") );
		ejecutorSubprocesos.execute( new PrintTask("Tarea3") );
		
		// ejecutorSubprocesos.shutdown();
		
	}

}
