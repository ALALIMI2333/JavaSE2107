package thread;

public class ThreadInfoDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();

        String name = main.getName();
        System.out.println("name"+name);

        long id = main.getId();
        System.out.println("id:"+id);

        int priority = main.getPriority();
        System.out.println("优先级:"+priority);

        boolean isAlive = main.isAlive();
        System.out.println("isAlive"+isAlive);

        boolean isDaemon = main.isDaemon();
        System.out.println("isDaemon"+isDaemon);

        boolean isInterrupted = main.isInterrupted();
        System.out.println("isInterrupted"+isInterrupted);
    }
}
