/*PatientFactoryTest.java
Author: Nolubabalo Ndongeni
Student Number: 219319464
Date: 09 April 2022
 */
package za.ac.cput.Test.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Patient;
import za.ac.cput.Factory.PatientFactory;

import static org.junit.jupiter.api.Assertions.*;

class PatientFactoryTest {
    @Test
    void createPatient() {
        Patient pat = PatientFactory.createPatient("Nolubabalo Ndongeni","60 Hug Street", 67367872,"Female",23, "Hey" );
        assertNotNull(pat);
        System.out.println(pat.toString());
    }


}