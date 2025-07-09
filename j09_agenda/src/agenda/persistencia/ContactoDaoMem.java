package agenda.persistencia;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import agenda.modelo.Contacto;


public class ContactoDaoMem implements ContactoDao {
	
	
	private Map<Integer, Contacto> almacen;
	private int proximoId;
	
	
	public ContactoDaoMem() {
		almacen = new HashMap<Integer, Contacto>();
		proximoId = 1;
	}

	@Override
	public void insertar(Contacto c) {
		c.setIdContacto(proximoId++);
		almacen.put(c.getIdContacto(), c);
	}

	@Override
	public void actualizar(Contacto c) {
		almacen.replace(c.getIdContacto(), c);
		
	}

	@Override
	public boolean eliminar(int idContacto) {
		
		return almacen.remove(idContacto, almacen.get(idContacto));			
	}

	@Override
	public boolean eliminar(Contacto c) {
		return almacen.remove(c.getIdContacto(), c);
	}

	@Override
	public Contacto buscar(int idContacto) {
		return almacen.get(idContacto);
	}

	@Override
	public Set<Contacto> buscar(String cadena) {
		Set<Contacto> resu = new HashSet<>();
		
		for(Contacto valor : almacen.values()) {

			if(valor.getNombre().contains(cadena) || valor.getApellidos().contains(cadena) || valor.getApodo().contains(cadena)) {
				resu.add(valor);
			}
		}
		return resu;
			
	}

	@Override
	public Set<Contacto> buscarTodos() {
		
		Set<Contacto> todos = new HashSet<>(almacen.values());
		
		return todos;
	}

}
