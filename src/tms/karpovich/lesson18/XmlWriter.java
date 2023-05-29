package tms.karpovich.lesson18;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class XmlWriter {
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        Student student = new Student(1, "Pasha", "Male", new Course("First"));
        JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(student, new FileOutputStream("student.xml"));
    }
}
