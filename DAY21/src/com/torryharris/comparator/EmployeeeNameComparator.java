package com.torryharris.comparator;

import com.torryharris.model.employee;

import java.util.Comparator;

public class EmployeeeNameComparator implements Comparator<employee>{



    @Override
    public int compare(employee o1, employee o2)
    {
        return o1.getName().compareTo(o2.getName());
    }
}
