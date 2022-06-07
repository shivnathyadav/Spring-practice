//package com.luv2code.springboot.demo.jpacruddemo.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import com.luv2code.springboot.demo.jpacruddemo.dao.EmployeeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.luv2code.springboot.demo.jpacruddemo.entity.Employee;
//
//@Service
//public class EmployeeServiceImpl implements EmployeeService {
//
//    private EmployeeRepository employeeRepository;
//
////    private EmployeeDAO employeeDAO;
//
//    @Autowired
//    public EmployeeServiceImpl( EmployeeRepository theEmployeeRepository) {
//       employeeRepository =theEmployeeRepository;
//        // employeeDAO = theEmployeeDAO;
//    }
//
//    @Override
//    public List<Employee> findAll() {
//        return employeeRepository.findAll();
//    }
//
//    @Override
//    public Employee findById(int theId) {
//
//        Optional<Employee> result =  employeeRepository.findById(theId);
//        Employee theEmployee = null;
//        if (result.isPresent())
//        {
//            theEmployee=result.get();
//        }
//        else{
//            throw new RuntimeException(" Did find the emp id "+theId);
//        }
//        return theEmployee;
//    }
//
//    @Override
//    public void save(Employee theEmployee) {
//        employeeRepository.save(theEmployee);
//    }
//
//    @Override
//    public void deleteById(int theId) {
//        employeeRepository.deleteById(theId);
//    }
//
//}
