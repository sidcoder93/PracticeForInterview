package com.virtualpairprogrammers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Test1", 4, 2000L );
        Employee employee2 = new Employee(2, "Test2", 4, 2000L );
        Employee employee3 = new Employee(3, "Test3", 5, 2000L );

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        Department department1 = new Department(4, "Sales");
        Department department2 = new Department(5, "Accounts");

        List<Department> departmentList = new ArrayList<>();
        departmentList.add(department1);
        departmentList.add(department2);

       /* List<Department> sales = departmentList.stream().filter(department ->
                     department.getDepartmentnName().equals("Sales")).collect(Collectors.toList());

        List<Employee> collect = employeeList.stream().filter(employee ->
                employee.getDepartmentId() == sales.get(0).getDepartmentId()).collect(Collectors.toList());
        */

        List<String> collect = employeeList.stream().map(emp -> emp.getEmployeeName()).collect(Collectors.toList());


    }
}
