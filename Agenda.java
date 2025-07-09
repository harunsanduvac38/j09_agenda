package agenda.negocio;


import java.util.Set;

import agenda.modelo.Contacto;

public interface Agenda {
	
	void insertarContacto(Contacto c);	
	
	Contacto eliminar(int idContacto);
	
	boolean eliminar(Contacto c);
	
	void modificar(Contacto c);
	
	//Debe retornar los contactos ordenados por apodo
	Set<Contacto> buscarTodos();
	
	//Busca los contactos que buscado aparezca en nombre, apellido1 o apellido2 del contacto
	Set<Contacto> buscarContactoPorNombre(String buscado);
	
	// No implementar
	int importarCSV(String fichero) throws IOException;
	
	Contacto buscar(int idContacto);
}
