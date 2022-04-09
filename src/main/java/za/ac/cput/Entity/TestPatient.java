/*TestPatient.java
Author: Nolubabalo Ndongeni
Student Number: 219319464
Date: 07 April 2022
 */
package za.ac.cput.Entity;

public class TestPatient {
    private String testID;
    private String testName;
    private String patientID;

    private TestPatient(){
    }
    private TestPatient(TestPatient.Builder builder){
        this.testID = builder.testID;
        this.testName = builder.testName;
        this.patientID = builder.patientID;
    }

    public String getTestID() {
        return testID;
    }

    public void setTestID(String testID) {
        this.testID = testID;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    @Override
    public String toString() {
        return "TestPatient{" +
                "testID=" + testID +
                ", testName='" + testName + '\'' +
                ", patientID=" + patientID +
                '}';
    }
    public static class Builder{
        private String testID;
        private String testName;
        private String patientID;


        public Builder setTestID(String testID) {
            this.testID = testID;
            return this;
        }

        public Builder setTestName(String testName) {
            this.testName = testName;
            return this;
        }

        public Builder setPatientID(String patientID) {
            this.patientID = patientID;
            return this;
        }

        public Builder copy(TestPatient test){
            this.testID = test.testID;
            this.testName = test.testName;
            this.patientID = test.patientID;
            return this;
        }
        public TestPatient build(){
            return new TestPatient(this);
        }
    }

}
