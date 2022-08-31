package model.dao;

import model.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao creatSellerDao(){
        return new SellerDaoJDBC();
    }
}
