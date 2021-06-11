package ec.edu.ups.controlador;

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
public class TarjetaCreditoBean {

}
