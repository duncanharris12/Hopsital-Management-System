package za.ac.cput.Repository;

public interface IRepository <obj,Attr>{
    obj create(obj Obj1);
    obj read(Attr ID);
    obj update(obj Obj2);
    boolean delete(Attr ID);
    }
