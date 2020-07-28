package ec.edu.ups.ejb;

 

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ec.edu.ups.modelo.SignosVitales;

 
@Stateless
public class SignosVitalesFacade extends AbstractFacade<SignosVitales>{
    

	@PersistenceContext(unitName = "TENEGUAMAN-ADRIAN-EXAMENFINAL")
    private EntityManager em;

 
    public SignosVitalesFacade() {
        super(SignosVitales.class);
    }

 

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}