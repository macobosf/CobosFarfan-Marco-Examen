package ec.edu.ups.controlador;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import ec.edu.ups.ejb.PedidoFacade;
import ec.edu.ups.entidades.TarjetaCredito;
import ec.edu.ups.entidades.Comidas;




@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@RequestScoped
public class PedidoBean implements Serializable {
	
	public static final long serialVersionUID = 1L;
	@EJB
	private PedidoFacade ejbPedido;
	
	private int numero;
	private Date fecha;
	private String nombreCliente;
	private double subtotal;
	private double iva;
	private double total;
	private String observaciones;
	private TarjetaCredito tarjetaPedido;
	private List<Comidas> comida;
	
	
}
