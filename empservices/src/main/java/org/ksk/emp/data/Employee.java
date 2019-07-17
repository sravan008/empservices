package org.ksk.emp.data;

import lombok.Data;
import lombok.ToString;

import java.sql.Date;

/**
 * Created by sravan on 7/17/2019.
 */
@Data
@ToString
public class Employee {

    private String empName;
    private String empUniqueId;
    private Address address;
    private String emailAddress;
    private String password;
    private String loginId;
    private Date dataOfBirth;

}
