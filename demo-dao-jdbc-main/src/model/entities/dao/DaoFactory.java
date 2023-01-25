package model.entities.dao;

import db.DB;
import model.entities.dao.impl.DepartmentDaoJDBC;
import model.entities.dao.impl.SellerDaoJDBC;


public class DaoFactory {

    public static  SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }
    public static DepartmentDao createDepartmentDao(){return  new DepartmentDaoJDBC(DB.getConnection());}

}
