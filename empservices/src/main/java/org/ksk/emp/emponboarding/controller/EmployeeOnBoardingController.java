package org.ksk.emp.emponboarding.controller;

import org.ksk.emp.emponboarding.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sravan on 7/21/2019.
 */
@RestController
public class EmployeeOnBoardingController {


    @RequestMapping("/")
    @ResponseBody
    public String helloMessage() {
        return "Please use the approiate Request-Mapping for the Result";
    }


    @RequestMapping("/emplist")
    public List<Employee> getEmployees() {
        List<Employee> employeesList = new ArrayList<Employee>();
        employeesList.add(new Employee(1, "sravan", "kumar", "sravankk@gmail.com"));
        return employeesList;
    }

}
