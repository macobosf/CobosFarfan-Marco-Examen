package ec.edu.ups.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidades.Comidas;

public class ComidasFacade extends AbstractFacade<Comidas> {

	@PersistenceContext(unitName = "CobosFarfan-Marco-Examen")
	private EntityManager em;
	
	public ComidasFacade() {
		super(Comidas.class);
	}
	
	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

}
