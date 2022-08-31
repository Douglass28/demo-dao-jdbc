package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

import java.sql.SQLException;


public class Program {
    public static void main(String[] args) throws SQLException {


        SellerDao sellerDao = DaoFactory.creatSellerDao();

        System.out.println("======= TESTE 1: seller findById =========");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
    }
}
