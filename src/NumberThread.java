public class NumberThread extends Thread {
    private int start;
    private int stop;
    private int delay;

    public NumberThread(int start, int stop, int delay) {
        this.start = start;
        this.stop = stop;
        this.delay = delay;
    }

    @Override
    public void run() {
        try {
            for (int i = start; i <= stop; i++) {
                System.out.println(i);
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted"+e.getMessage());
        }
    }
}



