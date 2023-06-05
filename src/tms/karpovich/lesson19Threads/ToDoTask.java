package tms.karpovich.lesson19Threads;

import java.time.Month;
import java.util.Date;

enum Priority{
    LOW,
    MEDIUM,
    HIGH
}

public class ToDoTask {
    private int id;
    private Date date;
    private String text;
    private Priority priority;
    private String status;
//    Month month = Month.APRIL;

    public ToDoTask() {
    }

    public ToDoTask(int id, Date date, String text, Priority priority, String status) {
        this.id = id;
        this.date = date;
        this.text = text;
        this.priority = priority;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriotiry(Priority priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
