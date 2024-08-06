package com.java8;

import java.util.*;

public class ListTest {

    public static int main(String[] args, int i){

        return 1;

    }
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Jiya", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));


        Map<String, Integer> map = new HashMap<>();
        for(Employee employee : employeeList){

            map.put(employee.getName(), map.getOrDefault(employee.getName(),0)+1);
        }

        Iterator<Employee> iterator = employeeList.iterator();

        while (iterator.hasNext()){

            Employee next = iterator.next();
            if(map.get(next.getName())>1){
                iterator.remove();
            }
        }




        //employeeList.removeIf(employee -> map.get(employee.getName())>1);

        employeeList.forEach(System.out::println);


    }
}
