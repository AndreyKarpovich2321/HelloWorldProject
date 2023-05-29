package tms.karpovich.lesson18;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;


public class DOMParserExample {
    public static void main(String[] args) {
        try {
            File inputFile = new File("class.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder(); //just constant things, library
            Document doc = dBuilder.parse(inputFile); //gather all information, makes  a tree, copy from file in document-tree.
            doc.getDocumentElement().normalize(); //normal tree. all parameters in it - nodes (students,curses etc. list of objects type node
            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("student"); //no classes, everything im xml is NODE. we want students
            //can be not student. start from firstname and etc
            System.out.println(nList.getLength());
            for (int i = 0; i < nList.getLength(); i++) {
                Node current = nList.item(i); //every student
                System.out.println("Element: " + current.getNodeName()); //it is student
                Element element = (Element) current; //element have some properties that we want to use. it is the start of the search - student.search in student
                System.out.println(element.getAttribute("rollno"));
                System.out.println(element.getElementsByTagName("firstname").item(0).getTextContent());
                //index 0 because every student has only one first name
                //getTextContent - show text between <> </>

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //lombok - i will not write getters setters constructors
    }
}
