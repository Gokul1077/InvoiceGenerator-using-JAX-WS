/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicewebservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author jana
 */
@WebService(serviceName = "InvoiceWebService")
public class InvoiceWebService {

    /**
     * This is a sample web service operation
     */
    
    double subTotal = 0, cgst = 0, sgst = 0, cess = 0, totalCost = 0;
    
    @WebMethod(operationName = "subTotal")
    public Double subTotal(@WebParam(name = "Quantity") double quantity, @WebParam(name = "UnitCost") double unitCost){
        subTotal = quantity * unitCost;
        String str = String.format("%.02f", subTotal);
        return  Double.parseDouble(str) ;
    }
    
    @WebMethod(operationName = "SGST")
    public Double sgst(@WebParam(name = "sgstpercentage") double percentage){
        sgst = (subTotal * percentage) / 100;
        String str = String.format("%.02f", sgst);
        return Double.parseDouble(str);
    }
    
    @WebMethod(operationName = "CGST")
    public Double cgst(@WebParam(name = "cgstpercentage") double percentage){
        cgst = (subTotal * percentage) / 100;
        String str = String.format("%.02f", cgst);
        return Double.parseDouble(str);
    }
    
    @WebMethod(operationName = "CESS")
    public Double cess(@WebParam(name = "cgstpercentage") double percentage){
        
        cess = (subTotal * percentage) / 100;
        String str = String.format("%.02f", cess);
        return Double.parseDouble(str);
    }
    
    @WebMethod(operationName = "TotalCost")
    public Double totalCost(){
        
        totalCost = subTotal + sgst + cgst + cess ;
        String str = String.format("%.02f", totalCost);
        return Double.parseDouble(str);
    }
}
