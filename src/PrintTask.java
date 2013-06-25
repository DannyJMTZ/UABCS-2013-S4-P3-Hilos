
public class PrintTask implements Runnable {
	
	private final int tiempoInactividad;
	private final String nombreTarea;
	private final static java.util.Random generador = new java.util.Random();
	
	public PrintTask( String nombre ){
		nombreTarea = nombre;
		tiempoInactividad = generador.nextInt( 5000 );
	}
	
	
	@Override
	public void run() { 
		
		System.out.printf("%s va a estsar inactivo durante %d milisegundos.\n" , nombreTarea , tiempoInactividad );
		
		try { Thread.sleep( tiempoInactividad ); } 
		catch (InterruptedException e) { 
			System.out.printf( "%s %s \n" , nombreTarea , "Termino en forma prematura, debido a la interrupción" ); 
		}
		
		System.out.printf("%s termino su inactividad\n" , nombreTarea);
		
	}
}
