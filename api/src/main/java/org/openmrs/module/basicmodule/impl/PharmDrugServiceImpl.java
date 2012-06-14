/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.basicmodule.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.basicmodule.PharmDrug;
import org.openmrs.module.basicmodule.PharmDrugService;
import org.openmrs.module.basicmodule.db.PharmDrugDAO;
import org.springframework.transaction.annotation.Transactional;

/**
 * Implementation of our {@link PharmDrugService} interface. This class is set in the
 * /metadata/moduleApplicationContext.xml file to be matched to the
 * {@link PharmDrugService} interface. <br/>
 * <br/>
 * This class extends {@link BaseOpenmrsService} so that there are empty methods
 * for onStartup and onShutdown. This allows sheilds us from changes to the
 * OpenmrsService interface from forcing us to implement the methods. <br/>
 * <br/>
 * NEVER call "new PharmDrugServiceImpl()....". To use this class, you do: <br/>
 * <code>
 *   
 *   Context.getService(PharmDrugService.class).savePharmDrug(drug)...
 *   
 * </code>
 * 
 */
public class PharmDrugServiceImpl extends BaseOpenmrsService implements PharmDrugService {
    	/**
	 * This "dao" object is set by spring. See the
	 * /metadata/moduleApplicationContext.xml for what value gets set here. We
	 * can assume that this will never be null, even though it never gets set in
	 * here. This is called Inversion of Control (IoC)
	 */
	private PharmDrugDAO dao;

	/**
	 * This is the method that spring calls to set the DAO
	 * 
	 * @param dao
	 *            the dao to set
	 */
	public void setDao(PharmDrugDAO dao) {
		this.dao = dao;
	}

	/**
	 * @see org.openmrs.module.patientnotes.NoteService#getNote(java.lang.Integer)
	 */
	@Transactional(readOnly = true)
	public PharmDrug getPharmDrug(Integer id) {
		return dao.getPharmDrug(id);
	}

	@Transactional
	public PharmDrug savePharmDrug(PharmDrug drug) {
		return dao.savePharmDrug(drug);
	}
}
