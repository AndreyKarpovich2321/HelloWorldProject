package tms.karpovich.lesson17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        File folder = new File(path);
        if (!folder.isDirectory()) {
            System.out.println("Путь не является директорией");
            return;
        }
        File[] files = folder.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("В директории нет файлов");
            return;
        }
        Map<String, Document> documents = new HashMap<>();
        for (File file : files) {
            if (!file.getName().endsWith(".txt")) {
                continue;
            }
            Scanner fileScanner = new Scanner(file);
            String fileName = file.getName().replace(".txt", "");
            Document document = new Document();
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                Pattern documentPattern = Pattern.compile("\\d{4}-[a-zA-Z]{3}-\\d{4}-[a-zA-Z]{3}-[a-zA-Z]{2}\\d{1}");
                Matcher documentMatcher = documentPattern.matcher(line);
                while (documentMatcher.find()) {
                    document.addDocument(documentMatcher.group());
                }
                Pattern phonePattern = Pattern.compile("\\+\\(\\d{2}\\)\\d{7}");
                Matcher phoneMatcher = phonePattern.matcher(line);
                if (phoneMatcher.find()) {
                    document.setPhoneNumber(phoneMatcher.group());
                }
                Pattern emailPattern = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b");
                Matcher emailMatcher = emailPattern.matcher(line);
                if (emailMatcher.find()) {
                    document.setEmail(emailMatcher.group());
                }
            }
            documents.put(fileName, document);
        }
        System.out.println(documents);
    }

    static class Document {
        private List<String> documents;
        private String phoneNumber;
        private String email;

        public Document() {
            documents = new ArrayList<>();
        }

        public void addDocument(String document) {
            documents.add(document);
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return "Document{" +
                    "documents=" + documents +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }
    }
}
