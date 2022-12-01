/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javainfinite.DAO.ApplianceDao;
import javainfinite.DAOImpl.ApplianceDaoImpl;
import javainfinite.pojo.ApplianceDetails;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author LENOVO
 */
public class ApplianceController extends HttpServlet {
    ApplianceDetails appliance = new ApplianceDetails();
    ApplianceDaoImpl applianceDaoImpl = new ApplianceDaoImpl();
    ApplianceDao adao;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getParameter("addAppliance")!=null){
            String productcode = request.getParameter("productcode");
            String name = request.getParameter("name");
            String type = request.getParameter("type");
            String companyname = request.getParameter("companyname");
            String price = request.getParameter("price");
            String dprice = request.getParameter("dprice");
            String description = request.getParameter("description");
            String stockavailable = request.getParameter("stockavailable");
            String manufacturerid = request.getParameter("manufacturerid");
            appliance.setProductcode(productcode);
            appliance.setName(name);
            appliance.setType(type);
            appliance.setCompanyname(companyname);
            appliance.setPrice(price);
            appliance.setDprice(dprice);
            appliance.setDescription(description);
            appliance.setStockavailable(stockavailable);
            appliance.setManufacturerid(manufacturerid);
            applianceDaoImpl.saveAppliance(appliance);
            RequestDispatcher rd = request.getRequestDispatcher("ApplianceAdd.html");
            rd.forward(request, response);
        }  
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getParameter("showAppliance")!=null){
            List<ApplianceDetails> applianceList = new ArrayList();
            applianceList = applianceDaoImpl.showAllAppliances();
            request.setAttribute("applianceList", applianceList);
            RequestDispatcher rd = request.getRequestDispatcher("ShowAll.jsp");
            rd.forward(request, response);
        }
          if(request.getParameter("updateAppliance")!=null){
             int id1 = Integer.parseInt(request.getParameter("id"));
             String productcode = request.getParameter("productcode");
             String nameupdate = request.getParameter("nameupdate");
             String typeupdate = request.getParameter("typeupdate");
             String companynameupdate = request.getParameter("companynameupdate");
             String priceupdate = request.getParameter("priceupdate");
             String dpriceupdate = request.getParameter("dpriceupdate");
             String descriptionupdate = request.getParameter("descriptionupdate");
             String stockavailableupdate = request.getParameter("stockavailableupdate");
             String manufactureridupdate = request.getParameter("manufactureridupdate");
             applianceDaoImpl.updateAppliance(id1, productcode, nameupdate, typeupdate, companynameupdate, priceupdate, dpriceupdate, descriptionupdate, stockavailableupdate, manufactureridupdate);
             
             RequestDispatcher rd = request.getRequestDispatcher("ApplianceAdd.html");
             rd.forward(request, response);
             
         }     
         if(request.getParameter("deleteAppliance")!=null){
             int id2 = Integer.parseInt(request.getParameter("id"));
             appliance.setId(id2);
             applianceDaoImpl.deleteAppliance(appliance);
             RequestDispatcher rd = request.getRequestDispatcher("ApplianceAdd.html");
             rd.forward(request, response);
         }
    }        
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
