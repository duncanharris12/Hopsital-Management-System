/*IPatient.java
Author: Nolubabalo Ndongeni
Student Number: 219319464
Date: 08 April 2022
 */
package za.ac.cput.Repository;

import za.ac.cput.Entity.Patient;

import java.util.Set;

public interface IPatient extends IRepository<Patient,String> {
    public Set<Patient> getAll();
}
