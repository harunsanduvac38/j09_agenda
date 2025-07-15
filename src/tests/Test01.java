package tests;

import agenda.modelo.Contacto;
import agenda.util.Contactos;

public class Test01 {
	
	public static void main(String[] args) {
		
		
		for(Contacto c : Contactos.generaContactos()) {
			System.out.println(c);
		}
	}

}
