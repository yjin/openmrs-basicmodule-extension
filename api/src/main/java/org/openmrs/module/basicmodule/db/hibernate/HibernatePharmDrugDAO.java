/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.basicmodule.db.hibernate;

import org.hibernate.SessionFactory;
import org.openmrs.module.basicmodule.PharmDrug;
import org.openmrs.module.basicmodule.PharmDrugService;
import org.openmrs.module.basicmodule.db.PharmDrugDAO;

/**
 *
 * @author Yan
 */
public class HibernatePharmDrugDAO implements PharmDrugDAO{
    
	private SessionFactory sessionFactory;

	/**
	 * This is a Hibernate object. It gives us metadata about the currently
	 * connected database, the current session, the current db user, etc. To
	 * save and get objects, calls should go through
	 * sessionFactory.getCurrentSession() <br/>
	 * <br/>
	 * This is called by Spring. See the /metadata/moduleApplicationContext.xml
	 * for the "sessionFactory" setting. See the applicationContext-service.xml
	 * file in CORE openmrs for where the actual "sessionFactory" object is
	 * first defined.
	 * 
	 * @param sessionFactory
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public PharmDrug getPharmDrug(Integer id) {
		return (PharmDrug) sessionFactory.getCurrentSession().get(PharmDrug.class, id);
	}


	public PharmDrug savePharmDrug(PharmDrug drug) {
		sessionFactory.getCurrentSession().saveOrUpdate(drug);
		return drug;
	}

}
