/*PatientRepositoryTest.java
Author: Nolubabalo Ndongeni
Student Number: 219319464
Date: 09 April 2022
 */
package za.ac.cput.Test.Repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Patient;
import za.ac.cput.Factory.PatientFactory;
import za.ac.cput.Repository.PatientRepository;

import static org.junit.jupiter.api.Assertions.*;

class PatientRepositoryTest {
    private static PatientRepository repository= PatientRepository.getRepository();
    private static Patient patient = PatientFactory.createPatient("Monde Masoka", "197 Madayi Street", 78645322,"Male", 21,"Mundah");
    Patient pat = repository.create(patient);

    @Test
    void create() {
        assertEquals(patient.getPatientID(), pat.getPatientID());
    }

    @Test
    void read() {
        Patient read = repository.read(patient.getPatientID());
        System.out.println(read.toString());
        assertNotNull(read);
    }

    @Test
    void update() {
        Patient update =  new Patient.Builder().copy(patient).setPatientName("Monde Shaun Ndongeni").setAddress("197 Madayi Street").setPhone_number(567778682)
                .setSex("Male").setAge(22).setPatientPassword("HeyMundah").build();
        assertNotNull(repository.update(update));
        System.out.println(repository.getAll());
    }

    @Test
    void delete() {
        boolean success = repository.delete(patient.getPatientID());
        assertTrue(success);
    }

    @Test
    void getAll() {
        System.out.println(repository.getAll());
    }


}