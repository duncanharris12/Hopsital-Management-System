/* TestPatientFactoryTest.java
Author: Nolubabalo Ndongeni
Student Number: 219319464
Date: 09 April 2022
 */

package za.ac.cput.Test.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.TestPatient;
import za.ac.cput.Factory.TestPatientFactory;

import static org.junit.jupiter.api.Assertions.*;

class TestPatientFactoryTest {
    @Test
    void createTestPatient() {
        TestPatient testPatient = TestPatientFactory.createTestPatient("Urine Test");
        assertNotNull(testPatient);
        System.out.println(testPatient);
    }


}