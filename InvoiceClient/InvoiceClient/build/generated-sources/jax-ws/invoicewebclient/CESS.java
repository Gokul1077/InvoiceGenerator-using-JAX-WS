
package invoicewebclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CESS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CESS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cgstpercentage" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CESS", propOrder = {
    "cgstpercentage"
})
public class CESS {

    protected double cgstpercentage;

    /**
     * Gets the value of the cgstpercentage property.
     * 
     */
    public double getCgstpercentage() {
        return cgstpercentage;
    }

    /**
     * Sets the value of the cgstpercentage property.
     * 
     */
    public void setCgstpercentage(double value) {
        this.cgstpercentage = value;
    }

}
