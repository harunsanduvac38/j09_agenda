package inicio;

import agenda.vista.MenuPrincipal;
import agenda.vista.swing.VInicial;

public class Main {
	public static void main(String[] args) {
		
		
		if(args.length != 1) {
			System.err.println("Debe ejecutar Main consola o Main grafico");
			return;
		}
		if(args[0].equals("grafico"))
			new VInicial();
		else
			new MenuPrincipal();
		
		
		
//		new MenuPrincipal();
//		new VInicial();
		
		
		
	}

}
