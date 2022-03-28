package com.masai.SortAccToValue;

import java.util.Comparator;
import java.util.Map;

public class EmployeesalaryComp implements Comparator<Map.Entry<String,Employee>> {

    @Override
    public int compare(Map.Entry<String, Employee> o1, Map.Entry<String, Employee> o2) {
        Employee e1 = o1.getValue();
        Employee e2 = o2.getValue();

        return e1.getSalary()>e2.getSalary() ? 1 : -1;
    }
}
