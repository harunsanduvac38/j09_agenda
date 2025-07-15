package agenda.persistencia;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import agenda.modelo.Contacto;
import agenda.util.Contactos;


public class ContactoDaoMem implements ContactoDao {
	
	
	private Map<Integer, Contacto> almacen;
	private int proximoId;
	
	
	public ContactoDaoMem() {
		almacen = new HashMap<Integer, Contacto>();
		proximoId = 1;
		cargaInicial();
	}
	
	private void cargaInicial() {
		for(Contacto c : Contactos.generaContactos()) {
			insertar(c);
		}
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
		return almacen.remove(idContacto) != null;			
	}

	@Override
	public boolean eliminar(Contacto c) {
		return eliminar(c.getIdContacto());
	}

	@Override
	public Contacto buscar(int idContacto) {
		return almacen.get(idContacto);
	}

	@Override
	public Set<Contacto> buscar(String cadena) {
		Set<Contacto> resu = new HashSet<>();
		cadena = cadena.toLowerCase();
		for(Contacto valor : almacen.values()) {

			if(valor.getNombre().toLowerCase().contains(cadena) || valor.getApellidos().toLowerCase().contains(cadena) || valor.getApodo().toLowerCase().contains(cadena)) {
				resu.add(valor);
			}
		}
		return resu;
			
	}

	@Override
	public Set<Contacto> buscarTodos() {
		return new HashSet<>(almacen.values());
	}
//asdfas
}
