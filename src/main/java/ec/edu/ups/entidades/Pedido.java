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
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pedidos")
	private List<Pedido> pedidoComida = new ArrayList<Pedido>();
	
	
	
	
	
	
	
	
   
}
