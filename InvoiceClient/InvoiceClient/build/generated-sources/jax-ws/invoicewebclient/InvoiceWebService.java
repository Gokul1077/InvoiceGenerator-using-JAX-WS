
package invoicewebclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "InvoiceWebService", targetNamespace = "http://invoicewebservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface InvoiceWebService {


    /**
     * 
     * @param cgstpercentage
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CGST")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CGST", targetNamespace = "http://invoicewebservice/", className = "invoicewebclient.CGST")
    @ResponseWrapper(localName = "CGSTResponse", targetNamespace = "http://invoicewebservice/", className = "invoicewebclient.CGSTResponse")
    @Action(input = "http://invoicewebservice/InvoiceWebService/CGSTRequest", output = "http://invoicewebservice/InvoiceWebService/CGSTResponse")
    public String cgst(
        @WebParam(name = "cgstpercentage", targetNamespace = "")
        double cgstpercentage);

    /**
     * 
     * @param cgstpercentage
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CESS")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CESS", targetNamespace = "http://invoicewebservice/", className = "invoicewebclient.CESS")
    @ResponseWrapper(localName = "CESSResponse", targetNamespace = "http://invoicewebservice/", className = "invoicewebclient.CESSResponse")
    @Action(input = "http://invoicewebservice/InvoiceWebService/CESSRequest", output = "http://invoicewebservice/InvoiceWebService/CESSResponse")
    public String cess(
        @WebParam(name = "cgstpercentage", targetNamespace = "")
        double cgstpercentage);

    /**
     * 
     * @param quantity
     * @param unitCost
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "subTotal", targetNamespace = "http://invoicewebservice/", className = "invoicewebclient.SubTotal")
    @ResponseWrapper(localName = "subTotalResponse", targetNamespace = "http://invoicewebservice/", className = "invoicewebclient.SubTotalResponse")
    @Action(input = "http://invoicewebservice/InvoiceWebService/subTotalRequest", output = "http://invoicewebservice/InvoiceWebService/subTotalResponse")
    public String subTotal(
        @WebParam(name = "Quantity", targetNamespace = "")
        double quantity,
        @WebParam(name = "UnitCost", targetNamespace = "")
        double unitCost);

    /**
     * 
     * @param sgstpercentage
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "SGST")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SGST", targetNamespace = "http://invoicewebservice/", className = "invoicewebclient.SGST")
    @ResponseWrapper(localName = "SGSTResponse", targetNamespace = "http://invoicewebservice/", className = "invoicewebclient.SGSTResponse")
    @Action(input = "http://invoicewebservice/InvoiceWebService/SGSTRequest", output = "http://invoicewebservice/InvoiceWebService/SGSTResponse")
    public String sgst(
        @WebParam(name = "sgstpercentage", targetNamespace = "")
        double sgstpercentage);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "TotalCost")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "TotalCost", targetNamespace = "http://invoicewebservice/", className = "invoicewebclient.TotalCost")
    @ResponseWrapper(localName = "TotalCostResponse", targetNamespace = "http://invoicewebservice/", className = "invoicewebclient.TotalCostResponse")
    @Action(input = "http://invoicewebservice/InvoiceWebService/TotalCostRequest", output = "http://invoicewebservice/InvoiceWebService/TotalCostResponse")
    public String totalCost();

}
