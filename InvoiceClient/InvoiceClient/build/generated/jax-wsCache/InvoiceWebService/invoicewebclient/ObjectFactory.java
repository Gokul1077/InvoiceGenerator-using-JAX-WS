
package invoicewebclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the invoicewebclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SGST_QNAME = new QName("http://invoicewebservice/", "SGST");
    private final static QName _TotalCostResponse_QNAME = new QName("http://invoicewebservice/", "TotalCostResponse");
    private final static QName _CESSResponse_QNAME = new QName("http://invoicewebservice/", "CESSResponse");
    private final static QName _TotalCost_QNAME = new QName("http://invoicewebservice/", "TotalCost");
    private final static QName _CGSTResponse_QNAME = new QName("http://invoicewebservice/", "CGSTResponse");
    private final static QName _CGST_QNAME = new QName("http://invoicewebservice/", "CGST");
    private final static QName _SubTotalResponse_QNAME = new QName("http://invoicewebservice/", "subTotalResponse");
    private final static QName _SubTotal_QNAME = new QName("http://invoicewebservice/", "subTotal");
    private final static QName _CESS_QNAME = new QName("http://invoicewebservice/", "CESS");
    private final static QName _SGSTResponse_QNAME = new QName("http://invoicewebservice/", "SGSTResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: invoicewebclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CESSResponse }
     * 
     */
    public CESSResponse createCESSResponse() {
        return new CESSResponse();
    }

    /**
     * Create an instance of {@link TotalCost }
     * 
     */
    public TotalCost createTotalCost() {
        return new TotalCost();
    }

    /**
     * Create an instance of {@link SGST }
     * 
     */
    public SGST createSGST() {
        return new SGST();
    }

    /**
     * Create an instance of {@link TotalCostResponse }
     * 
     */
    public TotalCostResponse createTotalCostResponse() {
        return new TotalCostResponse();
    }

    /**
     * Create an instance of {@link CGSTResponse }
     * 
     */
    public CGSTResponse createCGSTResponse() {
        return new CGSTResponse();
    }

    /**
     * Create an instance of {@link CGST }
     * 
     */
    public CGST createCGST() {
        return new CGST();
    }

    /**
     * Create an instance of {@link SubTotalResponse }
     * 
     */
    public SubTotalResponse createSubTotalResponse() {
        return new SubTotalResponse();
    }

    /**
     * Create an instance of {@link SubTotal }
     * 
     */
    public SubTotal createSubTotal() {
        return new SubTotal();
    }

    /**
     * Create an instance of {@link CESS }
     * 
     */
    public CESS createCESS() {
        return new CESS();
    }

    /**
     * Create an instance of {@link SGSTResponse }
     * 
     */
    public SGSTResponse createSGSTResponse() {
        return new SGSTResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SGST }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://invoicewebservice/", name = "SGST")
    public JAXBElement<SGST> createSGST(SGST value) {
        return new JAXBElement<SGST>(_SGST_QNAME, SGST.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalCostResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://invoicewebservice/", name = "TotalCostResponse")
    public JAXBElement<TotalCostResponse> createTotalCostResponse(TotalCostResponse value) {
        return new JAXBElement<TotalCostResponse>(_TotalCostResponse_QNAME, TotalCostResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CESSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://invoicewebservice/", name = "CESSResponse")
    public JAXBElement<CESSResponse> createCESSResponse(CESSResponse value) {
        return new JAXBElement<CESSResponse>(_CESSResponse_QNAME, CESSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalCost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://invoicewebservice/", name = "TotalCost")
    public JAXBElement<TotalCost> createTotalCost(TotalCost value) {
        return new JAXBElement<TotalCost>(_TotalCost_QNAME, TotalCost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CGSTResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://invoicewebservice/", name = "CGSTResponse")
    public JAXBElement<CGSTResponse> createCGSTResponse(CGSTResponse value) {
        return new JAXBElement<CGSTResponse>(_CGSTResponse_QNAME, CGSTResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CGST }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://invoicewebservice/", name = "CGST")
    public JAXBElement<CGST> createCGST(CGST value) {
        return new JAXBElement<CGST>(_CGST_QNAME, CGST.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubTotalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://invoicewebservice/", name = "subTotalResponse")
    public JAXBElement<SubTotalResponse> createSubTotalResponse(SubTotalResponse value) {
        return new JAXBElement<SubTotalResponse>(_SubTotalResponse_QNAME, SubTotalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubTotal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://invoicewebservice/", name = "subTotal")
    public JAXBElement<SubTotal> createSubTotal(SubTotal value) {
        return new JAXBElement<SubTotal>(_SubTotal_QNAME, SubTotal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CESS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://invoicewebservice/", name = "CESS")
    public JAXBElement<CESS> createCESS(CESS value) {
        return new JAXBElement<CESS>(_CESS_QNAME, CESS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SGSTResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://invoicewebservice/", name = "SGSTResponse")
    public JAXBElement<SGSTResponse> createSGSTResponse(SGSTResponse value) {
        return new JAXBElement<SGSTResponse>(_SGSTResponse_QNAME, SGSTResponse.class, null, value);
    }

}
