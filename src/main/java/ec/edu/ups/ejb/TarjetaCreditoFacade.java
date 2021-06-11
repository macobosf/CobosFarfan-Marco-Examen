package ec.edu.ups.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidades.TarjetaCredito;

public class TarjetaCreditoFacade extends AbstractFacade<TarjetaCredito> {
	
	@PersistenceContext(unitName = "CobosFarfan-Marco-Examen")
	private EntityManager em;
	
	public TarjetaCreditoFacade() {
		super(TarjetaCredito.class);
	}
	
	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}


}
