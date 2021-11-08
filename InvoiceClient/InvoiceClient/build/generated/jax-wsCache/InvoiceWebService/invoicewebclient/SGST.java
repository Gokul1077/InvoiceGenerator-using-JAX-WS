
package invoicewebclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SGST complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SGST">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sgstpercentage" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SGST", propOrder = {
    "sgstpercentage"
})
public class SGST {

    protected double sgstpercentage;

    /**
     * Gets the value of the sgstpercentage property.
     * 
     */
    public double getSgstpercentage() {
        return sgstpercentage;
    }

    /**
     * Sets the value of the sgstpercentage property.
     * 
     */
    public void setSgstpercentage(double value) {
        this.sgstpercentage = value;
    }

}
