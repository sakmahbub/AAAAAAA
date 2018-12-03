
package Xml;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class DOMCreateXMLDemo {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            
            //root Element
           Document doc = docBuilder.newDocument();
           Element rootElement = doc.createElement("Company");
           doc.appendChild(rootElement);
           
           
           //staff Element
           Element staff=doc.createElement("Staff");
           rootElement.appendChild(staff);
           
           
           //set attribute to staff element
           Attr attr = doc.createAttribute("id");
           attr.setValue("1");
           staff.setAttributeNode(attr);
            
            
        } catch (Exception e) {
        }
    }
    
}
