public class NumberGenerator implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
        System.out.println(this.hashCode());

    }

    public static void main(String[] args) {
        NumberGenerator obj = new NumberGenerator();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
