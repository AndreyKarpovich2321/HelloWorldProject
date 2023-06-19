package tms.karpovich.lesson19Threads;





public class ToDoTask {
    private int id;
    private String completionDate;
    private String description;
    private String priority;
    private String status;

    public ToDoTask() {
    }

    public ToDoTask(int id, String completionDate, String description, String priority, String status) {
        this.id = id;
        this.completionDate = completionDate;
        this.description = description;
        this.priority = priority;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(String completionDate) {
        this.completionDate = completionDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriotiry(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return id + " | " + completionDate + " | " + description + " | " + priority + " | " + status;
    }
}

