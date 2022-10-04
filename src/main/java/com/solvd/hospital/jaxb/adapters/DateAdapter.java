package com.solvd.hospital.jaxb.adapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateAdapter extends XmlAdapter<String, Date> {

    @Override
    public Date unmarshal(String s) throws Exception {
        DateFormat format = new SimpleDateFormat("yy-MM-dd", Locale.ENGLISH);
        return format.parse(s);
    }

    @Override
    public String marshal(Date d) throws Exception {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        return format.format(d);
    }
}
