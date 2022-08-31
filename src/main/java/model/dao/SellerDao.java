package model.dao;


import model.entities.Department;
import model.entities.Seller;

import java.sql.SQLException;
import java.util.List;

public interface SellerDao {

    void insert(Seller obg);
    void update(Seller obg);
    void deleteById(Integer id);
    Seller findById(Integer id) throws SQLException;
    List<Seller> findAll();

    List<Seller> findByDepartment (Department department);
}
