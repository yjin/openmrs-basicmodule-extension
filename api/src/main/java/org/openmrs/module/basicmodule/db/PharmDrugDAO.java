/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.basicmodule.db;

import org.openmrs.module.basicmodule.PharmDrug;

/**
 * This is the DAO interface. This is never used by the developer, but instead
 * the {@link NoteService} calls it (and developers call the NoteService)
 * @author Yan
 */
public interface PharmDrugDAO {
    
    	PharmDrug getPharmDrug(Integer id);

	PharmDrug savePharmDrug(PharmDrug drug);
}
