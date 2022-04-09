/*TestRepository.java
Author: Nolubabalo Ndongeni
Student Number: 219319464
Date: 08 April 2022
 */
package za.ac.cput.Repository;

import za.ac.cput.Entity.TestPatient;

import java.util.HashSet;
import java.util.Set;

public class TestPatientRepository implements ITestPatient {
    private Set<TestPatient> TestDB;
    private static TestPatientRepository repository = null;

    private TestPatientRepository(){
        TestDB = new HashSet<TestPatient>();

    }

    public static TestPatientRepository getRepository(){
        if(repository==null){
            repository = new TestPatientRepository();
        }
        return repository;
    }


    @Override
    public TestPatient create(TestPatient test){
        boolean success = TestDB.add(test);
        if(!success)
            return null;
        return test;
    }


    @Override
    public TestPatient read(String testID){
        TestPatient test = TestDB.stream().filter(e ->e.getTestID().equals(testID)).findAny().orElse(null);
        return test;
    }

    @Override
    public TestPatient update(TestPatient test){
        TestPatient oldTest = read(test.getTestID());
        if(oldTest != null){
            System.out.println("removed" +oldTest);
            TestDB.remove(oldTest);
            TestDB.add(test);
        }
        return test;
    }

    @Override
    public boolean delete(String testID){
        TestPatient deleteTest = read(testID);
        if(deleteTest == null){
            return false;
        }
        TestDB.remove(deleteTest);
        return true;
    }
    @Override
    public Set<TestPatient>getAll(){
        return TestDB;
    }
}
