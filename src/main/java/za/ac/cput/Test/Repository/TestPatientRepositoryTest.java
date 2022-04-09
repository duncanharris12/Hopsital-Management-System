/* TestPatientRepositoryTest.java
Author: Nolubabalo Ndongeni
Student Number: 219319464
Date: 09 April 2022
 */

package za.ac.cput.Test.Repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.TestPatient;
import za.ac.cput.Factory.TestPatientFactory;
import za.ac.cput.Repository.TestPatientRepository;


import static org.junit.jupiter.api.Assertions.*;

class TestPatientRepositoryTest {
    private static TestPatientRepository repository = TestPatientRepository.getRepository();
    private static TestPatient testPatient = TestPatientFactory.createTestPatient("DNA");
    TestPatient test = repository.create(testPatient);


    @Test
    void create() {
        assertSame(testPatient.getTestID(),test.getTestID());

    }

    @Test
    void read() {
        TestPatient read = repository.read(testPatient.getTestID());
        assertNotNull(read);
    }

    @Test
    void update() {
        TestPatient update = new TestPatient.Builder().copy(testPatient).setTestName("Blood test").build();
        assertNotNull(repository.update(update));
        System.out.println(repository.getAll());
    }

    @Test
    void delete() {
        boolean success = repository.delete(testPatient.getTestID());
        assertTrue(success);
    }

    @Test
    void getAll() {
        System.out.println(repository.getAll());
    }


}