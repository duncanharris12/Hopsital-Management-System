package za.ac.cput.Entity;

//This is a worker class for laboratory entity under entity package.
//In this class will implement an entity called Laboratory using a builder pattern.
//This is Laboratory.java

import java.util.Date;

/**
 *
 * @author Chuma Nxazonke
 * Student number: 219181187
 * Date: 07 April 2022
 */



public class Laboratory {
//Declaring all the  private fields we are going to use on our program

private String labId;
private String patientId;
private String doctorId;
private String testId;
private Date labDate;
private double amount;


//Creating a private parameterized constructor

    private Laboratory (Builder builder){

        this.labId  = builder.labId;
        this.doctorId = builder.doctorId;
        this.patientId = builder.patientId;
        this.testId = builder.testId;
        this.labDate = builder.labDate;
        this.amount = builder.amount;


    }

    public String getLabId() {
        return labId;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public String getTestId() {
        return testId;
    }

    public Date getLabDate() {
        return labDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setLabId(String labId) {
        this.labId = labId;
    }

    public void setPatientId(String patientId1) {
        this.patientId = patientId1;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public void setLabDate(Date labDate) {
        this.labDate = labDate;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Laboratory{" +
                "labId='" + labId + '\'' +
                ", patientId='" + patientId + '\'' +
                ", doctorId='" + doctorId + '\'' +
                ", testId='" + testId + '\'' +
                ", labDate=" + labDate +
                ", amount=" + amount +
                '}';
    }

    public static class Builder{

        private String labId;
        private String patientId;
        private String doctorId;
        private String testId;
        private Date labDate;
        private double amount;


       public Builder setLabId (String labId1){
           this.labId = labId1;
           return this;
       }
        public Builder setPatientId (String patientId1){
            this.patientId = patientId1;
            return this;
        }

        public Builder setDoctorId (String doctorId1){
            this.doctorId = doctorId1;
            return this;
        }

        public Builder setTestId (String testId1){
            this.testId = testId1;
            return this;
        }

        public Builder setLabDate (Date labDate1){
            this.labDate = labDate1;
            return this;
        }

        public Builder setAmount (double amount1){
            this.amount = amount1;
            return this;
        }

        public Builder Copy (Laboratory laboratory){

           this.labId = laboratory.labId;
           this.patientId = laboratory.patientId;
           this.doctorId = laboratory.doctorId;
           this.testId = laboratory.testId;
           this.labDate = laboratory.labDate;
           this.amount = laboratory.amount;

           return this;
        }


        public Laboratory build(){
           return new Laboratory(this);
        }

    }

}
