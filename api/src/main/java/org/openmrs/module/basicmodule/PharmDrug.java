/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.basicmodule;

import org.openmrs.BaseOpenmrsData;

/**
 *
 * @author Yan
 */
public class PharmDrug extends BaseOpenmrsData {

    private Integer id; // the primary key colum
    private String name;
    private String general_desc;
    private String dosage_desc;

    /**
     * Default constructore. Hibernate demands a no-argument constructor so that
     * it can make this objects easily.
     */
    public PharmDrug() {
    }


    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the general_desc
     */
    public String getGeneral_desc() {
        return general_desc;
    }

    /**
     * @param general_desc the general_desc to set
     */
    public void setGeneral_desc(String general_desc) {
        this.general_desc = general_desc;
    }

    /**
     * @return the dosage_desc
     */
    public String getDosage_desc() {
        return dosage_desc;
    }

    /**
     * @param dosage_desc the dosage_desc to set
     */
    public void setDosage_desc(String dosage_desc) {
        this.dosage_desc = dosage_desc;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }
}
