<%-- 
    Document   : ShowAll
    Created on : 6 Sep, 2022, 7:09:27 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <style>
            body{
                background-color: lightgrey;
                background-image: url("img.jpg");
                background-repeat: no-repeat;
                background-size: 100% 800px;
            }
            
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Product</title>
         <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script>
            $(document).ready(function(){
                $("#deleteAppliance").hide();
                $("#updateAppliance").hide();
            $("#update").click(function(){
                $("#updateAppliance").show();
                $("#deleteAppliance").hide();
            });
            $("#delete").click(function(){
                $("#deleteAppliance").show();
                $("#updateAppliance").hide();
            });
        });
</script>
    </head>
    <body>
        All Appliances: <br> 
        <c:forEach var="prt" items="${applianceList}">
            Product ID: ${prt.id} <br>
            Product Code: ${prt.productcode} <br>
            Product Name: ${prt.name} <br>
            Product Type: ${prt.type} <br>
            Company Name: ${prt.companyname}<br>
            Product Price: ${prt.price}<br>
            Product Dprice: ${prt.dprice} <br>
            Product Description: ${prt.description}<br>
            Stock available: ${prt.stockavailable}<br>
            Manufacturer id: ${prt.manufacturerid} <br>
            -------------------------------------<br>
        </c:forEach>
        <form action="ApplianceController" method="POST">
            Update: <input type="checkbox" id="update"> Delete: <input type="checkbox" id="delete" onclick="document.getElementById('productcode').disabled=this.checked;document.getElementById('nameupdate').disabled=this.checked;document.getElementById('typeupdate').disabled=this.checked;document.getElementById('companynameupdate').disabled=this.checked;document.getElementById('priceupdate').disabled=this.checked;document.getElementById('dpriceupdate').disabled=this.checked;document.getElementById('descriptionupdate').disabled=this.checked;document.getElementById('stockavailableupdate').disabled=this.checked;document.getElementById('manufactureridupdate').disabled=this.checked;"><br><br>
            <select name="id">
                <c:forEach items="${applianceList}" var="appliance">
                <option value="${appliance.id}">${appliance.id}</option>
                 </c:forEach>
            </select>
            <br>
            Update Productcode: <input id="productcode" type="text" name="productcode"><br><br>
            Update Name: <input id="nameupdate" type="text" name="nameupdate"><br><br>
            Update Type: <input id="typeupdate" type="text" name="typeupdate"> <br><br>
            Update Companyname: <input id="companynameupdate" type="text" name="companynameupdate"> <br><br>
            Update Price: <input id="priceupdate" type="text" name="priceupdate"> <br><br>
            Update Dprice: <input id="dpriceupdate" type="text" name="dpriceupdate"> <br><br>
            Update Description: <input id="descriptionupdate" type="text" name="descriptionupdate"> <br><br>
            Update Stockavailable: <input id="stockavailableupdate" type="text" name="stockavailableupdate"> <br><br>
            Update Manufacturerid: <input id="manufactureridupdate" type="text" name="manufactureridupdate"> <br><br>
            <button type="submit" id="updateAppliance" name="updateAppliance"> Update</button>
            <button type="submit" id="deleteAppliance" name="deleteAppliance"> Delete </button>
        </form>
    </body>
</html>
