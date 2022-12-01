/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javainfinite.DAOImpl;

import java.util.ArrayList;
import java.util.List;
import javainfinite.DAO.ApplianceDao;
import javainfinite.pojo.ApplianceDetails;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author LENOVO
 */

public class ApplianceDaoImpl implements ApplianceDao {
    @Override
    public void saveAppliance (ApplianceDetails appliance){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(appliance);
        transaction.commit();
        session.close();
    }
    
    @Override
    public List<ApplianceDetails> showAllAppliances() {
        List<ApplianceDetails> applianceList = new ArrayList();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("From ApplianceDetails");
        applianceList = query.list();
        return applianceList;
    }
    
    @Override
    public void updateAppliance(int id, String productcode, String name, String type, String companyname, String price, String dprice, String description, String stockavailable,
    String manufacturerid) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        ApplianceDetails appdetails = (ApplianceDetails)session.load(ApplianceDetails.class, id);
        appdetails.setProductcode(productcode);
        appdetails.setName(name);
        appdetails.setType(type);
        appdetails.setCompanyname(companyname);
        appdetails.setPrice(price);
        appdetails.setDprice(dprice);
        appdetails.setDescription(description);
        appdetails.setStockavailable(stockavailable);
        appdetails.setManufacturerid(manufacturerid);        
        session.update(appdetails);
        transaction.commit();
        session.close();
    }
   
    @Override
     public void deleteAppliance(ApplianceDetails appliance){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(appliance);
        transaction.commit();
        session.close();
    }    
}
