package agenda.modelo;

import java.io.Serializable;
import java.util.Objects;

public class Domicilio implements Serializable {

	private String tipoVia;
	private String via;
	private int numero;
	private int piso;
	private String puerta;
	private String codigoPostal;
	private String ciudad;
	private String provincia;
	
	
	
	
	public Domicilio(String tipoVia, String via, int numero, int piso, String puerta, String codigoPostal,
			String ciudad, String provincia) {
		super();
		this.tipoVia = tipoVia;
		this.via = via;
		this.numero = numero;
		this.piso = piso;
		this.puerta = puerta;
		this.codigoPostal = codigoPostal;
		this.ciudad = ciudad;
		this.provincia = provincia;
	}
	public Domicilio() {
		// TODO Auto-generated constructor stub
	}
	public String getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	
	
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero= numero;
	}
	
	
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	
	
	public String getPuerta() {
		return puerta;
	}
	public void setPuerta(String puerta) {
		this.puerta = puerta;
	}
	
	
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}


	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	@Override
	public String toString() {
		return "Domicilio (" + tipoVia + ", " + via + ", " + numero + ", " + piso + ", "
				+ puerta + ")";
	}

	
	
	



	
	
	
	
	
	
	
	
}
