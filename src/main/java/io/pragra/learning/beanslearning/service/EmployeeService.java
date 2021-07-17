package io.pragra.learning.beanslearning.service;

import io.pragra.learning.beanslearning.beans.Employee;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

// sigleton
// prototype - every time spring will give you new bean
// request - valid for MVC, spring will create new bean for every request
// session - valid for http session

@Component
@Scope("prototype") // request/session
public class EmployeeService {

    private List<Employee> employees = new ArrayList<>();

    public void createEmployee(Employee employee){
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Employee getEmployeeName(String name){
        return employees.stream().filter(employee -> employee.equals(name)).findAny().get();
    }
}
