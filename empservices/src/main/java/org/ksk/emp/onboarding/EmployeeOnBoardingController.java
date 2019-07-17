package org.ksk.emp.onboarding;

import org.ksk.emp.data.Employee;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;

/**
 * Created by sravan on 7/17/2019.
 */
@RestController
public class EmployeeOnBoardingController {


    @GetMapping("/emp/{id}/")
    public Employee getEmployeeDetails(@PathVariable("id") int id) {

        Employee emp = new Employee();
        emp.setEmpName("Prem");
        emp.setDataOfBirth(new Date(12 - 12 - 2001));
        return emp;


    }


}
