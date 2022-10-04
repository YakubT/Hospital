package com.solvd.hospital.jaxb.adapters;

import com.solvd.hospital.models.enums.BloodGroup;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class BloodGroupAdapter extends XmlAdapter<String, BloodGroup> {

    @Override
    public BloodGroup unmarshal(String s) throws Exception {
        return  BloodGroup.findByValue(s);
    }

    @Override
    public String marshal(BloodGroup bloodGroup) throws Exception {
        return bloodGroup.getValue();
    }
}
