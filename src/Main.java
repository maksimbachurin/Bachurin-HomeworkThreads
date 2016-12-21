/**
 * Created by Максим on 21.12.2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutionManager executionManager = new ExecutionManagerImpl();
        Runnable callback = new Task("call", 0, false);
        Runnable[] tasks = {new Task("do", 300, true), new Task("don't", 500, false), new Task("yes", 0, false),
                new Task("doagain", 2, false), new Task("right", 5, false), new Task("no", 6, false)};
        Context execute = executionManager.execute(callback, tasks);

        Thread.sleep(1);
        execute.interrupt();
        Thread.sleep(1000);
        System.out.println(execute.isFinished());
        System.out.println(execute.getFailedTaskCount());
        System.out.println(execute.getCompletedTaskCount());
        System.out.println(execute.getInterruptedTaskCount());
    }
}