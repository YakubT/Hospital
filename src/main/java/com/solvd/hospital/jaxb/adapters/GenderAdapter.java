package com.solvd.hospital.jaxb.adapters;

import com.solvd.hospital.models.enums.Gender;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class GenderAdapter extends XmlAdapter<String, Gender> {

    @Override
    public Gender unmarshal(String s) throws Exception {
        return Gender.findByValue(s);
    }

    @Override
    public String marshal(Gender gender) throws Exception {
        return gender.getValue();
    }
}
