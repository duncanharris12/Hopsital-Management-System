/*TestPatientFactory.java
Author: Nolubabalo Ndongeni
Student Number: 219319464
Date: 07 April 2022
 */
package za.ac.cput.Factory;

import za.ac.cput.Entity.TestPatient;
import za.ac.cput.Util.Helper;

public class TestPatientFactory {
    public static TestPatient createTestPatient(String testName){
        String testID = Helper.generateTestID();
        String patientID = Helper.generatePatientID();
        TestPatient test = new TestPatient.Builder().setTestID(testID).setTestName(testName).setPatientID(patientID).build();
        return test;
    }

    public static void main(String[] args) {
        TestPatient test = TestPatientFactory.createTestPatient("Blood Test");
        System.out.println(test);
    }

}
