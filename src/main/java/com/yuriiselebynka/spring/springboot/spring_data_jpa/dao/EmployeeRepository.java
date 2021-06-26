package com.yuriiselebynka.spring.springboot.spring_data_jpa.dao;


import com.yuriiselebynka.spring.springboot.spring_data_jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository// необов`язкова анотація - Springboot і так розуміє, що це є Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
   public List<Employee> findAllByName(String name);
}
