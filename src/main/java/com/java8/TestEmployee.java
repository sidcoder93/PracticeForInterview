package com.java8;

import java.util.*;
import java.util.stream.Collectors;

public class TestEmployee {

    public static void main(String[] args) {


        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


        //Number of male and female employees
        Map<String, Long> collect = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(collect);

        /**
         *   Print name of all departments:
         */
         employeeList.stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);


        System.out.println("--------------------");

        /**
         * Avarage Age of Male and Female Employees
         */

        Map<String, Double> avaMap= employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));


        avaMap.forEach((k,v) -> System.out.println("Avarage Age of "+k + " is " +v));


        System.out.println("--------------------");

        /**
         * Details of Highest Paid Employee
         */

        Optional<Employee> collect1 = employeeList.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));


        Employee emp = collect1.get();

        System.out.println(emp.getName());




        System.out.println("--------------------");

        /**
         * Names of employees joined after 2015
         */

            employeeList.stream()
                    .filter(ep -> ep.getYearOfJoining()>2015)
                    .map(Employee::getName)
                    .forEach(System.out::println);



        System.out.println("--------------------");

        /**
         * Number of employees in each department
         */

        Map<String, Long> countMap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        countMap.forEach((k,v) -> System.out.println("No of Employees in Department "+k+ " are "+ v));

        System.out.println("--------------------");

        /**
         * Avarage salary of each department
         */

        Map<String, Double> avaSalaryDepartment = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));


        avaSalaryDepartment.forEach((k,v) -> System.out.println("Avarage Salary of Department "+k+ " is "+ v));


        System.out.println("--------------------");

        /**
         * Details of youngest Male employee in product development Department
         */

        Optional<Employee> youngestMaleEmployee = employeeList.stream()
                .filter(ep -> "Male".equals(ep.getGender()) && "Product Development".equals(ep.getDepartment()))
                .min(Comparator.comparingInt(Employee::getAge));

       Employee young =  youngestMaleEmployee.get();

        System.out.println(young.getName());

        System.out.println("--------------------");

        /**
         *Who has the most working exp
         */

        Optional<Employee> first = employeeList.stream()
                .min(Comparator.comparingInt(Employee::getYearOfJoining));

        Employee mostExp = first.get();

        System.out.println(mostExp.getName());


        System.out.println("--------------------");

        /**
         *  Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
         */

        Map<Boolean, List<Employee>> collect2 = employeeList.stream()
                .collect(Collectors.partitioningBy(e -> e.getAge() >= 25));

        for (Map.Entry<Boolean, List<Employee>> e : collect2.entrySet()){

            if(e.getKey()){

                System.out.println("Employes are greater than or equal to 25");
            }

            else
            {
                System.out.println("Employees are less than 25 years of age");
            }

            System.out.println("-----------------");

            List<Employee> list = e.getValue();

            for (Employee ee : list)
            {
                System.out.println(ee.getName());
            }

        }

        System.out.println("--------------------");

        /**
         *  What is the average salary and total salary of the whole organization?
         */

        DoubleSummaryStatistics collect3 = employeeList.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println("Total Salary "+collect3.getSum());
        System.out.println("Ava Salary "+ collect3.getAverage());
        System.out.println("Count of total "+ collect3.getCount());


        /*
        Sort Employee by salary in decreasing order
         */

        employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);


        /*
        Find the second highest salary using
         */
        System.out.println("-----------------------------------");
        Optional<Employee> first1 = employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(2)
                .skip(1)
                .findFirst();

        System.out.println(first1.get().getName());


    }

}
