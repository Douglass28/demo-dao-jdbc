package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.nio.channels.SelectableChannel;
import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Department obj = new Department(1, "Books");
        System.out.println(obj);

        Seller seller = new Seller(1,"Douglas",
                "douglas@gmail.com", new Date(), 3000.0, obj);

        SellerDao sellerDao = DaoFactory.creatSellerDao();

        System.out.println(seller);
    }
}
