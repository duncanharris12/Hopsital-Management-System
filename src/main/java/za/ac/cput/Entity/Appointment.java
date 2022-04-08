
package za.ac.cput.Entity;

//This is a worker class for Appointment entity under entity package.
//In this class will implement an entity called Appointment using a builder pattern.
//This is Appointment.java


import java.sql.Time;
import java.util.Date;

/**
 * @author Chuma Nxazonke
 * Student number: 219181187
 * Date: 07 April 2022
 */


public class Appointment {
    //Declaring all the fields for the program as private fields

    private String appointmentId;
    private  String doctorId;
    private String appointmentType;
    private   String appointmentDescription;
    private  Date appointmentDate;
    private Time appointmentTime;

//Creating a private parametrized constructor

    private Appointment (Builder builder){
        this.appointmentId  = builder.appointmentId;
        this.doctorId = builder.doctorId;
        this.appointmentType = builder.appointmentType;
        this.appointmentDescription = builder.appointmentDescription;
        this.appointmentDate = builder.appointmentDate;
        this.appointmentTime = builder.appointmentTime;


    }

public String getAppointmentId (){
        return appointmentId;
}

public void setAppointmentId(String appointmentId1){
        this.appointmentId = appointmentId1;
}

public String getDoctorId (){
        return doctorId;
}

public void setDoctorId (String doctorId1){
        this.doctorId = doctorId1;
}

public String getAppointmentType (){
        return  appointmentType;
}

public void setAppointmentType (String appointmentType1){
        this.appointmentType = appointmentType1;
}

public String getAppointmentDescription (){
        return appointmentDescription;
}

public void setAppointmentDescription (String appointmentDescription1){

        this.appointmentDescription = appointmentDescription1;
}

public Date getAppointmentDate (){
        return appointmentDate;
}

public void setAppointmentDate (Date appointmentDate1){

        this.appointmentDate = appointmentDate1;
}

public Time getAppointmentTime (){
        return appointmentTime;

}

public void setAppointmentTime (Time appointmentTime1){
        this.appointmentTime  = appointmentTime1;
}

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentId='" + appointmentId + '\'' +
                ", doctorId='" + doctorId + '\'' +
                ", appointmentType='" + appointmentType + '\'' +
                ", appointmentDescription='" + appointmentDescription + '\'' +
                ", appointmentDate=" + appointmentDate +
                ", appointmentTime=" + appointmentTime +
                '}';
    }

    public static class Builder{
        //Declaring all the fields for the program as private fields

        private String appointmentId;
        private  String doctorId;
        private String appointmentType;
        private   String appointmentDescription;
        private  Date appointmentDate;
        private Time appointmentTime;


public Builder setAppointmentId (String appointmentId1){
    this.appointmentId = appointmentId1;
    return this;
}

public Builder setDoctorId(String doctorId1){
    this.doctorId = doctorId1;
    return this;
}

public Builder setAppointmentType ( String appointmentType1){
    this.appointmentType = appointmentType1;
    return this;
}

public Builder setAppointmentDescription(String appointmentDescription1){
    this.appointmentDescription = appointmentDescription1;
    return this;
}

public Builder setAppointmentDate(Date appointmentDate1){
    this.appointmentDate = appointmentDate1;
    return  this;
}

public Builder setAppointmentTime(Time appointmentTime1){
    this.appointmentTime = appointmentTime1;
    return this;
}


public Builder Copy (Appointment appointment){

    this.appointmentId = appointment.appointmentId;
    this.doctorId = appointment.doctorId;
    this.appointmentType = appointment.appointmentType;
    this.appointmentDescription = appointment.appointmentDescription;
    this.appointmentDate = appointment.appointmentDate;
    this.appointmentTime = appointment.appointmentTime;

    return this;

}

public Appointment build(){
    return new Appointment(this);
}


    }



}
