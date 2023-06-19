package tms.karpovich.lesson19Threads;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ToDoListData {
    static Scanner scanner = new Scanner(System.in);
    static List<ToDoTask> taskList = new ArrayList<>();
    public static void main(String[] args) throws IOException {
//        List<ToDoTask> taskList = Arrays.asList(new ToDoTask(1, "06-06-2023", "Get Groceries", "High", "Done"),
//                new ToDoTask(2, "06-06-2023", "Call Mom", "Low", "Done"),
//                new ToDoTask(3, "06-06-2023", "Get Dentist Appointment", "Medium", "Undone"),
//                new ToDoTask(4, "06-06-2023", "Pay Bills", "High", "Undone"));
        fillTasksFromJson(taskList);


    }

    private static void chooseOption(List<ToDoTask> taskList) throws JsonProcessingException {
        System.out.println("Choose what to do next: \n"
                + "1. Delete task\n" + "2. Change status\n" + "3. Change priority\n" + "4. Change description\n" + "5. Finish program\n");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        switch (option){
            case "1" -> {deleteTaskbyId(taskList);}
            case "2" -> {changeStatus(taskList);}
            case "3" -> {changePriority(taskList);}
            case "4" -> {changeDescription(taskList);}
            case "5" -> {saveTasksToJson(taskList);}
        }
    }

    private static void changeStatus(List<ToDoTask> taskList) throws JsonProcessingException {
        System.out.println("Input id");
        int id = scanner.nextInt();
        ToDoTask current = taskList.get(id);
        if (current.getStatus().equals("Undone")){
            current.setStatus("Done");
        } else {
            current.setPriotiry("Undone");
        }
        chooseOption(taskList);
    }
    private static void changePriority(List<ToDoTask> taskList) throws JsonProcessingException {
        System.out.println("Input id");
        int id = scanner.nextInt();
        ToDoTask current = taskList.get(id);
        System.out.println("Input status: Low / Medium / High");
        String status = scanner.next();
        current.setStatus(status);
        chooseOption(taskList);
    }
    private static void changeDescription(List<ToDoTask> taskList) throws JsonProcessingException {
        System.out.println("Input id");
        int id = scanner.nextInt();
        ToDoTask current = taskList.get(id);
        System.out.println("Input new description ");
        String description = scanner.next();
        current.setDescription(description);
        chooseOption(taskList);
    }
    private static void deleteTaskbyId(List<ToDoTask> taskList) throws JsonProcessingException {
        System.out.println("Input id");
        int id = scanner.nextInt();
        taskList.remove(id - 1);
        chooseOption(taskList);
    }
    private static void fillTasksFromJson(List<ToDoTask> taskList) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String line = null;
        try (FileReader fr = new FileReader("tasks.json"); Scanner readerScanner = new Scanner(fr)){
            readerScanner.useDelimiter(";");
            while (readerScanner.hasNext()) {
                line = readerScanner.next();
                taskList.add(mapper.readValue(line, ToDoTask.class));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(taskList);
        chooseOption(taskList);
    }
    private static void saveTasksToJson(List<ToDoTask> taskList) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String result = null;
        try (FileWriter fw = new FileWriter("tasks2.json")){
            for(ToDoTask task : taskList) {
                result = mapper.writeValueAsString(task);
                fw.write(result + ";");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
