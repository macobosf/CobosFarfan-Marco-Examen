package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: TarjetaCredito
 *
 */
@Entity

public class TarjetaCredito implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public TarjetaCredito() {
		super();
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String numeroTarjeta;
	private String nombreTitular;
	private Date fechaCaducidad;
	private int cvv;
	
   
}
