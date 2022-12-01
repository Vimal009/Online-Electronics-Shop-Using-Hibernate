/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainfinite.DAO;

import java.util.List;
import javainfinite.pojo.ApplianceDetails;

/**
 *
 * @author LENOVO
 */
public interface ApplianceDao {
     public void saveAppliance (ApplianceDetails appliance);
    public List<ApplianceDetails> showAllAppliances();
    public void updateAppliance (int id, String productcode, String name, String type, String companyname, String price, String dprice, String description, String stockavailable,
    String manufacturerid);
    public void deleteAppliance (ApplianceDetails appliance);
    
}
