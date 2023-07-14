package anhnnth.codelean.securityspringproject.service;


import anhnnth.codelean.securityspringproject.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> findAll();
    public Employee findById(int theId);
    public void save(Employee theEmployee);
    public void deleteById(int theId);
    public List<Employee> searchByName(String theName);
}