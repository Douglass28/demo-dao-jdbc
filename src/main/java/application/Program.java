package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.sql.SQLException;
import java.util.List;


public class Program {
    public static void main(String[] args) throws SQLException {


        SellerDao sellerDao = DaoFactory.creatSellerDao();

        System.out.println("======= TESTE 1: seller findById =========");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("======= \n TESTE 2: seller findByDepartment =========");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obg : list){
            System.out.println(obg);
        }
    }
}
