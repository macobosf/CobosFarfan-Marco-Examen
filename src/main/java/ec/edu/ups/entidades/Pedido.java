package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Pedido
 *
 */
@Entity

public class Pedido implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numero;
	private Date fecha;
	private String nombreCliente;
	private double subtotal;
	private double iva;
	private double total;
	private String observaciones;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "comidaPedido")
	private List<Comidas> pedidoComida = new ArrayList<Comidas>();
	
	
	@ManyToOne
	@JoinColumn
	private TarjetaCredito tarjetaPedido;


	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Pedido(int numero, Date fecha, String nombreCliente, double subtotal, double iva, double total,
			String observaciones, List<Comidas> pedidoComida, TarjetaCredito tarjetaPedido) {
		super();
		this.numero = numero;
		this.fecha = fecha;
		this.nombreCliente = nombreCliente;
		this.subtotal = subtotal;
		this.iva = iva;
		this.total = total;
		this.observaciones = observaciones;
		this.pedidoComida = pedidoComida;
		this.tarjetaPedido = tarjetaPedido;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public String getNombreCliente() {
		return nombreCliente;
	}


	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}


	public double getSubtotal() {
		return subtotal;
	}


	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}


	public double getIva() {
		return iva;
	}


	public void setIva(double iva) {
		this.iva = iva;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	public String getObservaciones() {
		return observaciones;
	}


	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}


	public List<Comidas> getPedidoComida() {
		return pedidoComida;
	}


	public void setPedidoComida(List<Comidas> pedidoComida) {
		this.pedidoComida = pedidoComida;
	}


	public TarjetaCredito getTarjetaPedido() {
		return tarjetaPedido;
	}


	public void setTarjetaPedido(TarjetaCredito tarjetaPedido) {
		this.tarjetaPedido = tarjetaPedido;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		long temp;
		temp = Double.doubleToLongBits(iva);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nombreCliente == null) ? 0 : nombreCliente.hashCode());
		result = prime * result + numero;
		result = prime * result + ((observaciones == null) ? 0 : observaciones.hashCode());
		result = prime * result + ((pedidoComida == null) ? 0 : pedidoComida.hashCode());
		temp = Double.doubleToLongBits(subtotal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((tarjetaPedido == null) ? 0 : tarjetaPedido.hashCode());
		temp = Double.doubleToLongBits(total);
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
		Pedido other = (Pedido) obj;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (Double.doubleToLongBits(iva) != Double.doubleToLongBits(other.iva))
			return false;
		if (nombreCliente == null) {
			if (other.nombreCliente != null)
				return false;
		} else if (!nombreCliente.equals(other.nombreCliente))
			return false;
		if (numero != other.numero)
			return false;
		if (observaciones == null) {
			if (other.observaciones != null)
				return false;
		} else if (!observaciones.equals(other.observaciones))
			return false;
		if (pedidoComida == null) {
			if (other.pedidoComida != null)
				return false;
		} else if (!pedidoComida.equals(other.pedidoComida))
			return false;
		if (Double.doubleToLongBits(subtotal) != Double.doubleToLongBits(other.subtotal))
			return false;
		if (tarjetaPedido == null) {
			if (other.tarjetaPedido != null)
				return false;
		} else if (!tarjetaPedido.equals(other.tarjetaPedido))
			return false;
		if (Double.doubleToLongBits(total) != Double.doubleToLongBits(other.total))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Pedido [numero=" + numero + ", fecha=" + fecha + ", nombreCliente=" + nombreCliente + ", subtotal="
				+ subtotal + ", iva=" + iva + ", total=" + total + ", observaciones=" + observaciones
				+ ", pedidoComida=" + pedidoComida + ", tarjetaPedido=" + tarjetaPedido + "]";
	}
	
	
   
}
