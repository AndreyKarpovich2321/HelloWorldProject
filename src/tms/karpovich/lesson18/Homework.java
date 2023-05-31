package tms.karpovich.lesson18;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Homework {
    public static void main(String[] args) {
        String folderPath = args[0];
        File folder = new File(folderPath);
        File[] files = folder.listFiles();
        File xmlFile = null;

        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".xml")) {
                xmlFile = file;
                break;
            }
        }

        if (xmlFile == null) {
            System.out.println("No XML file found in the specified folder.");
            return;
        }

        String parserType = args[1];

        try {
            if (parserType.equals("1")) {
                parseWithSax(xmlFile);
            } else if (parserType.equals("2")) {
                parseWithDom(xmlFile);
            } else {
                System.out.println("Invalid parser type specified.");
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

    private static void parseWithSax(File xmlFile) throws ParserConfigurationException, SAXException, IOException {
        // TODO: Implement SAX parsing
    }

    private static void parseWithDom(File xmlFile) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(xmlFile);
        Element rootElement = document.getDocumentElement();
        NodeList lines = rootElement.getElementsByTagName("line");
        String firstName = rootElement.getElementsByTagName("firstName").item(0).getTextContent();
        String lastName = rootElement.getElementsByTagName("lastName").item(0).getTextContent();
        String title = rootElement.getElementsByTagName("title").item(0).getTextContent();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < lines.getLength(); i++) {
            sb.append(lines.item(i).getTextContent());
            sb.append("\n");
        }

        String fileName = firstName + "_" + lastName + "_" + title + ".txt";
        File outputFile = new File(fileName);

        FileWriter writer = new FileWriter(outputFile);
        writer.write(sb.toString());
        writer.close();
    }
}
