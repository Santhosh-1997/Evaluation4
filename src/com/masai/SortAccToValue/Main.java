package com.masai.SortAccToValue;

import java.util.*;

public class Main {

    public Map<String,Employee> getSortedMapWithValue(Map<String,Employee> originalMap){

        Set<Map.Entry<String,Employee>> set =  originalMap.entrySet();

        Comparator<Map.Entry<String,Employee>> c = (Map.Entry<String,Employee> o1, Map.Entry<String,Employee> o2 )->{

            Employee e1 = o1.getValue();
            Employee e2 = o2.getValue();

            return e1.getSalary()>e2.getSalary() ? 1 : -1;

        };

        List<Map.Entry<String,Employee>> list = new ArrayList<>(set);

        System.out.println("Before Sorting");
        for(Map.Entry<String,Employee> el : list){
            System.out.println(el.getKey());
            System.out.println(el.getValue());
            System.out.println();
        }

        Collections.sort(list,c);


        Map<String,Employee> result = new LinkedHashMap<>();
        for(Map.Entry<String,Employee> el : list){
            result.put(el.getKey(), el.getValue());
        }

        return result;

    }



    public static void main(String[] args) {
	// write your code here

        Map<String,Employee> empDetails = new HashMap<>();

        empDetails.put("HR",new Employee("1","Dhoni",10050));
        empDetails.put("Sales", new Employee("2","Srinee",100000000));
        empDetails.put("Marketing",new Employee("3","Vijay",1050));
        empDetails.put("Accounts",new Employee("4","Fleming",999));
        Main m = new Main();

        Map<String,Employee> newEmp = m.getSortedMapWithValue(empDetails);

        Set<Map.Entry<String,Employee>> newSet = newEmp.entrySet();

        System.out.println("******************************************************");
        System.out.println("After Sorting");
        System.out.println();
        for(Map.Entry<String,Employee> el : newSet){
            System.out.println(el.getKey());
            System.out.println(el.getValue());
            System.out.println();
        }

    }
}
