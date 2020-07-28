package ec.edu.ups.ejb;

 

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.modelo.CitasMedicas;

 
@Stateless
public class CitasMedicasFacade extends AbstractFacade<CitasMedicas>{
    

	@PersistenceContext(unitName = "TENEGUAMAN-ADRIAN-EXAMENFINAL")
    private EntityManager em;

 
    public CitasMedicasFacade() {
        super(CitasMedicas.class);
    }

 

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}