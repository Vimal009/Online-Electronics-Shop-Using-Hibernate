/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainfinite.pojo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author LENOVO
 */
@Entity
public class ApplianceDetails implements Serializable{
    @Id @GeneratedValue
    
    int id;
    String productcode;
    String name;
    String type;
    String companyname;
    String price;
    String dprice;
    String description;
    String stockavailable;
    String manufacturerid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDprice() {
        return dprice;
    }

    public void setDprice(String dprice) {
        this.dprice = dprice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStockavailable() {
        return stockavailable;
    }

    public void setStockavailable(String stockavailable) {
        this.stockavailable = stockavailable;
    }

    public String getManufacturerid() {
        return manufacturerid;
    }

    public void setManufacturerid(String manufacturerid) {
        this.manufacturerid = manufacturerid;
    }
    
}
