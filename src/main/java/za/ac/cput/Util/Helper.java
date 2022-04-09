/* Helper.java
Author: Nolubabalo Ndongeni
Student Number: 219319464
Date: 09 April 2022
 */
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
