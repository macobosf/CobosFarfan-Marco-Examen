package ec.edu.ups.controlador;

import java.io.Serializable;


import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import ec.edu.ups.ejb.ComidasFacade;
import ec.edu.ups.entidades.Comidas;
import ec.edu.ups.entidades.Pedido;


@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@RequestScoped
public class ComidasBean implements Serializable{
	
	public static final long serialVersionUID = 1L;
	@EJB
	private ComidasFacade ejbComida;
	
	private int codigo;
	private String nombre;
	private double precioUnitario;
	private Pedido pedido;
	
	public ComidasBean() {
		super();
	}
	

	public String create () {
		try {
			Comidas comida = new Comidas();
			comida.setCodigo(codigo);
			comida.setNombre(nombre);
			comida.setPrecioUnitario(precioUnitario);
			comida.setComidaPedido(pedido);
			ejbComida.create(comida);
		} catch (Exception e) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, 
					"Comida ya creada", null);
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage("msg1", message);
		}
		return null;
		
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

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	
	
	

}
