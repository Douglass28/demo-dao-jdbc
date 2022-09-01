package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;
import model.impl.SellerDaoJDBC;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);
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

        System.out.println("======= \n TESTE 3: seller findAll =========");
        list = sellerDao.findAll();
        for (Seller obg : list){
            System.out.println(obg);
        }

        System.out.println("======= \n TESTE 4: seller insert =========");
        Seller seller1 = new Seller(10, "redbul", "red@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(seller1);
        System.out.println(seller1);
        System.out.println("insert ok!, new Id :" + seller1.getId());

        System.out.println("======= \n TESTE 5: seller update =========");
        seller = sellerDao.findById(1);
        seller.setName("camila");
        sellerDao.update(seller);
        System.out.println("update completed..");

        System.out.println("======= \n TESTE 6: seller delete =========");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("delete completed");

        sc.close();
    }
}
