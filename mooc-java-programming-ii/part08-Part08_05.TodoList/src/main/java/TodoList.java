import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        this.list.add(task);
    }

    public void remove(int id) {
        if (id > this.list.size() || id < 0) {
            System.out.println("there is no such a task, buddy");
            return;
        }
        this.list.remove(id - 1);
    }

    public void print() {
        int i = 0;
        for (String task : this.list) {
            System.out.println((i + 1) + ": " + task);
            i++;
        }
    }
}
