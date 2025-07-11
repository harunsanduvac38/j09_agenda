package agenda.negocio;
import agenda.persistencia.ContactoDao;
import agenda.persistencia.ContactoDaoMem;
import agenda.persistencia.ContactoDaoMemSerial;

import java.io.IOException;
import java.text.Collator;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

import agenda.persistencia.ContactoDaoMem;

import agenda.modelo.Contacto;

public class AgendaClass implements Agenda{
	
	private ContactoDao cDao;
	
	public AgendaClass() {
//		cDao = new ContactoDaoMem();
		cDao = new ContactoDaoMemSerial();
	}

	@Override
	public void insertarContacto(Contacto c) {
		cDao.insertar(c);
		
	}

	@Override
	public Contacto eliminar(int idContacto) {
		Contacto aEliminar = cDao.buscar(idContacto);
		cDao.eliminar(idContacto);
		return aEliminar;
	}

	@Override
	public boolean eliminar(Contacto c) {
		
		return eliminar(c.getIdContacto()) != null;
	}

	@Override
	public void modificar(Contacto c) {
		cDao.actualizar(c);
		
	}

	@Override
	public Set<Contacto> buscarTodos() {
		Set<Contacto> setApodo = new TreeSet<Contacto>(getComparatorApodo());
		setApodo.addAll(cDao.buscarTodos());
		return setApodo;

	
		
	}

	@Override
	public Set<Contacto> buscarContactoPorNombre(String buscado) {
		Set<Contacto> setNombre = new TreeSet<Contacto>(getComparatorApodo());
		setNombre.addAll(cDao.buscar(buscado));
		
		return setNombre;
	}
	
	private Comparator<Contacto> getComparatorApodo() {
		return (c1, c2) -> {
			Collator col = Collator.getInstance(new Locale("es"));
			return col.compare(c1.getApodo(), c2.getApodo());
		};
	}

	@Override
	public int importarCSV(String fichero) throws IOException {
		String csv = cDao.toString();
		return csv.length();
	}

	@Override
	public Contacto buscar(int idContacto) {
		
		return cDao.buscar(idContacto);
	}

	

	
	


}
