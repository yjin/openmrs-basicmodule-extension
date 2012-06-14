/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.basicmodule;

import org.openmrs.api.OpenmrsService;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Yan
 */
public interface PharmDrugService extends OpenmrsService {
    	/**
	 * This persists our PharmDrug object to the database. If {@link PharmDrug#getId()} is
	 * null, then an "insert" is done. If it is non-null, then a sql update is
	 * done by hibernate. <br/>
	 * <br/>
	 * The "@should" in this javadoc below is an openmrs-specific thing that has
	 * to do with unit tests. The content of the @should says what the unit
	 * tests should be testing. See {@link PharmDrugServiceTest} for the matching
	 * unit test.
	 * 
	 * @param drug
	 *            The {@link PharmDrug} object to save in the database.
	 * @return The PharmDrug that was saved. {@link PharmDrug#getId()} will now be filled
	 *         in if it was null.
	 * 
	 * @should create a drug
	 */

	public PharmDrug savePharmDrug(PharmDrug drug);

	/**
	 * Get a {@link PharmDrug} object by primary key id.
	 * 
	 * @param id
	 *            the primary key integer id to look up on
	 * @return the found PharmDrug object which matches the row with the given id. If
	 *         no row with the given id exists, null is returned.
	 */
 
	public PharmDrug getPharmDrug(Integer id);
    
}
