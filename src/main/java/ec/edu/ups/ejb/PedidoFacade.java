package ec.edu.ups.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidades.Pedido;

public class PedidoFacade extends AbstractFacade<Pedido> {
	
	@PersistenceContext(unitName = "CobosFarfan-Marco-Examen")
	private EntityManager em;
	
	public PedidoFacade() {
		super(Pedido.class);
	}
	
	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}


}
