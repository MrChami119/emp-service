package com.example.emp_service.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CollectionId;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Builder
@Table(name = "employee", schema = "emp")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employeeid")
    private Long employeeId;

    @Column(name = "name")
    private String name;

    @Column(name = "manager")
    private String manager;

    @Column(name = "salary")
    private Integer salary;

    public Employee() {
    }

    public Employee(Long employeeId, String name, String manager, Integer salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.manager = manager;
        this.salary = salary;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", manager='" + manager + '\'' +
                ", salary=" + salary +
                '}';
    }
}
