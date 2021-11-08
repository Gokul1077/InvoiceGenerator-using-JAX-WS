
package invoicewebclient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "InvoiceWebService", targetNamespace = "http://invoicewebservice/", wsdlLocation = "http://localhost:8080/InvoiceGeneratorWebService/InvoiceWebService?WSDL")
public class InvoiceWebService_Service
    extends Service
{

    private final static URL INVOICEWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException INVOICEWEBSERVICE_EXCEPTION;
    private final static QName INVOICEWEBSERVICE_QNAME = new QName("http://invoicewebservice/", "InvoiceWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/InvoiceGeneratorWebService/InvoiceWebService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        INVOICEWEBSERVICE_WSDL_LOCATION = url;
        INVOICEWEBSERVICE_EXCEPTION = e;
    }

    public InvoiceWebService_Service() {
        super(__getWsdlLocation(), INVOICEWEBSERVICE_QNAME);
    }

    public InvoiceWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), INVOICEWEBSERVICE_QNAME, features);
    }

    public InvoiceWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, INVOICEWEBSERVICE_QNAME);
    }

    public InvoiceWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, INVOICEWEBSERVICE_QNAME, features);
    }

    public InvoiceWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InvoiceWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns InvoiceWebService
     */
    @WebEndpoint(name = "InvoiceWebServicePort")
    public InvoiceWebService getInvoiceWebServicePort() {
        return super.getPort(new QName("http://invoicewebservice/", "InvoiceWebServicePort"), InvoiceWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InvoiceWebService
     */
    @WebEndpoint(name = "InvoiceWebServicePort")
    public InvoiceWebService getInvoiceWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://invoicewebservice/", "InvoiceWebServicePort"), InvoiceWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (INVOICEWEBSERVICE_EXCEPTION!= null) {
            throw INVOICEWEBSERVICE_EXCEPTION;
        }
        return INVOICEWEBSERVICE_WSDL_LOCATION;
    }

}