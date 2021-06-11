package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: TarjetaCredito
 *
 */
@Entity

public class TarjetaCredito implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String numeroTarjeta;
	private String nombreTitular;
	private Date fechaCaducidad;
	private int cvv;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tarjetaPedido")
	private List<Pedido> pedidoTarjeta = new ArrayList<Pedido>();
	
	public TarjetaCredito() {
		super();
	}
	
	

	public TarjetaCredito(String numeroTarjeta, String nombreTitular, Date fechaCaducidad, int cvv,
			List<Pedido> pedidoTarjeta) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.nombreTitular = nombreTitular;
		this.fechaCaducidad = fechaCaducidad;
		this.cvv = cvv;
		this.pedidoTarjeta = pedidoTarjeta;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}



	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}



	public String getNombreTitular() {
		return nombreTitular;
	}



	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}



	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}



	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}



	public int getCvv() {
		return cvv;
	}



	public void setCvv(int cvv) {
		this.cvv = cvv;
	}



	public List<Pedido> getPedidoTarjeta() {
		return pedidoTarjeta;
	}



	public void setPedidoTarjeta(List<Pedido> pedidoTarjeta) {
		this.pedidoTarjeta = pedidoTarjeta;
	}


	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cvv;
		result = prime * result + ((fechaCaducidad == null) ? 0 : fechaCaducidad.hashCode());
		result = prime * result + ((nombreTitular == null) ? 0 : nombreTitular.hashCode());
		result = prime * result + ((numeroTarjeta == null) ? 0 : numeroTarjeta.hashCode());
		result = prime * result + ((pedidoTarjeta == null) ? 0 : pedidoTarjeta.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TarjetaCredito other = (TarjetaCredito) obj;
		if (cvv != other.cvv)
			return false;
		if (fechaCaducidad == null) {
			if (other.fechaCaducidad != null)
				return false;
		} else if (!fechaCaducidad.equals(other.fechaCaducidad))
			return false;
		if (nombreTitular == null) {
			if (other.nombreTitular != null)
				return false;
		} else if (!nombreTitular.equals(other.nombreTitular))
			return false;
		if (numeroTarjeta == null) {
			if (other.numeroTarjeta != null)
				return false;
		} else if (!numeroTarjeta.equals(other.numeroTarjeta))
			return false;
		if (pedidoTarjeta == null) {
			if (other.pedidoTarjeta != null)
				return false;
		} else if (!pedidoTarjeta.equals(other.pedidoTarjeta))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "TarjetaCredito [numeroTarjeta=" + numeroTarjeta + ", nombreTitular=" + nombreTitular
				+ ", fechaCaducidad=" + fechaCaducidad + ", cvv=" + cvv + ", pedidoTarjeta=" + pedidoTarjeta + "]";
	}
	
	
   
}
