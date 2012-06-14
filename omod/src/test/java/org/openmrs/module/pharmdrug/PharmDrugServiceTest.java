/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharmdrug;

import junit.framework.Assert;
import org.junit.Test;
import org.openmrs.api.context.Context;
import org.openmrs.module.basicmodule.PharmDrug;
import org.openmrs.module.basicmodule.PharmDrugService;
import org.openmrs.test.BaseModuleContextSensitiveTest;

/**
 *
 * @author Yan
 */
public class PharmDrugServiceTest extends BaseModuleContextSensitiveTest {
    //    private PharmDrug drug = null;

    @Override
    public Boolean useInMemoryDatabase() {
        return false;
    }

    @Test
    public void shouldGetPharmDrugObjectWithParameter() throws Exception {

        PharmDrugService service = (PharmDrugService) Context.getService(PharmDrugService.class);
        Assert.assertNotNull(service);
        PharmDrug obj = service.getPharmDrug(1);
        System.out.println(obj.getName());
        Assert.assertTrue(obj.getName().equals("test"));
        
    }

    @Test
    public void shouldSavePharmDrugObjectWithParameter() throws Exception {
        PharmDrug drug = new PharmDrug();
     //   drug.setId(3);
        drug.setName("test3");
        drug.setGeneral_desc("test3");
        drug.setDosage_desc("test3");

        PharmDrugService service = (PharmDrugService) Context.getService(PharmDrugService.class);
        Assert.assertNotNull(service);
        PharmDrug saveObj = service.savePharmDrug(drug);
        System.out.println(saveObj.getId());
        PharmDrug getObj = service.getPharmDrug(saveObj.getId());
        System.out.println(getObj.getId());
        Assert.assertTrue(saveObj.getName().equals("test3"));
   //     Assert.assertTrue(saveObj.getId().equals(3));
    }
}
