package appal.task;

public class Task {
    protected String task;
    protected boolean isDone;
    private static int totalTasks = 0;

    public Task(String task) {
        setTask(task);
        setDone(false);
        totalTasks += 1;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " ");
    }

    public String toString() {
        return "[" + getStatusIcon() + "] " + getTask();
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

    public static int getTotalTasks() {
        return totalTasks;
    }
}