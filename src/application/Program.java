/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.util.Date;
import javax.swing.text.DefaultEditorKit;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

/**
 *
 * @author User
 */
public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        Seller seller1 = new Seller(21,"bob","bob@gmail.com",new Date(),3000.00,obj);
//        injeção de dependencia sem explicitar a implementação
        SellerDao sellerDao = DaoFactory.createSellerDao();
        
        Seller  seller = sellerDao.findById(3);
        System.out.println(seller);
    }
}
