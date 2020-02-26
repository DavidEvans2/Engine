package edu.wctc.property.lab1;

import java.time.LocalDate;

/**
 * Fix the code in this class to do PROPERTY encapsulation correctly. Also
 * consider if any of the properties should be mandatory and use a constructor
 * to enforce that. Review the tips in the document "EncapCheckList.pdf" if
 * needed.
 *
 * @author Jim Lombardo
 * @version 1.02
 */
public class Employee {

    public String firstName;
    public String lastName;
    public final String ssn;
    public boolean metWithHr;
    public boolean metDeptStaff;
    public boolean reviewedDeptPolicies;
    public boolean movedIn;
    public String cubeId;
    public LocalDate orientationDate;



    public Employee(String firstName, String lastName, String cubeId, String ssn) {
        if (ssn.length() < 9 || ssn.length() > 9) {
            throw new IllegalArgumentException("Invalid entry. Your SSN should be 9 numbers.");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.cubeId = cubeId;

    }

}
