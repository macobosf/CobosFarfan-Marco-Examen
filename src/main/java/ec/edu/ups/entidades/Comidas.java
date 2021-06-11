package ec.edu.ups.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Comidas
 *
 */
@Entity

public class Comidas implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nombre;
	private double precioUnitario;
	
	@ManyToOne
	@JoinColumn
	private Pedido comidaPedido;
	
	public Comidas() {
		super();
	}

	public Comidas(int codigo, String nombre, double precioUnitario, Pedido comidaPedido) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precioUnitario = precioUnitario;
		this.comidaPedido = comidaPedido;
	}


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public Pedido getComidaPedido() {
		return comidaPedido;
	}


	public void setComidaPedido(Pedido comidaPedido) {
		this.comidaPedido = comidaPedido;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		result = prime * result + ((comidaPedido == null) ? 0 : comidaPedido.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		long temp;
		temp = Double.doubleToLongBits(precioUnitario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Comidas other = (Comidas) obj;
		if (codigo != other.codigo)
			return false;
		if (comidaPedido == null) {
			if (other.comidaPedido != null)
				return false;
		} else if (!comidaPedido.equals(other.comidaPedido))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (Double.doubleToLongBits(precioUnitario) != Double.doubleToLongBits(other.precioUnitario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Comidas [codigo=" + codigo + ", nombre=" + nombre + ", precioUnitario=" + precioUnitario
				+ ", comidaPedido=" + comidaPedido + "]";
	}
	
   
}
