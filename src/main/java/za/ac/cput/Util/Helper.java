package za.ac.cput.Util;

import java.util.UUID;

public class Helper {
    public static String generatePatientID(){
        return UUID.randomUUID().toString();
    }

    public static String generateTestID(){
        return UUID.randomUUID().toString();
    }
}
