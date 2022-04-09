/*IRepositoryjava
Author: Nolubabalo Ndongeni
Student Number: 219319464
Date: 08 April 2022
 */
package za.ac.cput.Repository;

public interface IRepository <obj,Attr>{
    obj create(obj Obj1);
    obj read(Attr ID);
    obj update(obj Obj2);
    boolean delete(Attr ID);
    }
