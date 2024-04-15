import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Task {
    private int id;
    private String title;
    private String description;

    public Task(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

public class TaskManager {

    private List<Task> tasks;
    private Scanner scanner;

    public TaskManager() {
        this.tasks = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void createTask() {
        System.out.println("Enter task id, title and description:");
        int id = scanner.nextInt();
        String title = scanner.next();
        String description = scanner.next();
        tasks.add(new Task(id, title, description));
    }

    public void readTasks() {
        for (Task task : tasks) {
            System.out.println("Id: " + task.getId() + ", Title: " + task.getTitle() + ", Description: " + task.getDescription());
        }
    }

    public void updateTask() {
        System.out.println("Enter the id of the task to update:");
        int id = scanner.nextInt();
        for (Task task : tasks) {
            if (task.getId() == id) {
                System.out.println("Enter new title and description:");
                String title = scanner.next();
                String description = scanner.next();
                task.setTitle(title);
                task.setDescription(description);
                break;
            }
        }
    }

    public void deleteTask() {
        System.out.println("Enter the id of the task to delete:");
        int id = scanner.nextInt();
        tasks.removeIf(task -> task.getId() == id);
    }

    
    /**
     * @param args
     */
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        try {
        while (true) {
            System.out.println("1. Create task\n2. Read tasks\n3. Update task\n4. Delete task\n5. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    taskManager.createTask();
                    break;
                case 2:
                    taskManager.readTasks();
                    break;
                case 3:
                    taskManager.updateTask();
                    break;
                case 4:
                    taskManager.deleteTask();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                }
            }
        } finally {
            scanner.close();
        }
    } }
