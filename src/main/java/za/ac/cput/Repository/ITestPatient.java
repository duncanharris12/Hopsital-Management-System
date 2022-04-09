/*ITestPatient.java
Author: Nolubabalo Ndongeni
Student Number: 219319464
Date: 08 April 2022
 */
package za.ac.cput.Repository;

import za.ac.cput.Entity.TestPatient;

import java.util.Set;

public interface ITestPatient extends IRepository<TestPatient, String>{
    public Set<TestPatient> getAll();
}
