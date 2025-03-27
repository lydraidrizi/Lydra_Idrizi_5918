
import java.util.Random;

class SummationTask implements Runnable {
    private final int[] array;
    private final int start;
    private final int end;
    private long partialSum;

    public SummationTask(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
        this.partialSum = 0;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            partialSum += array[i];
        }
    }

    public long getPartialSum() {
        return partialSum;
    }
}

public class ParallelArraySum {
    private static final int ARRAY_SIZE = 1000000;
    private static final int NUMBER_OF_THREADS = 4;

    public static void main(String[] args) {

        int[] array = new int[ARRAY_SIZE];
        Random random = new Random();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = random.nextInt(100);
        }


        int chunkSize = ARRAY_SIZE / NUMBER_OF_THREADS;
        SummationTask[] tasks = new SummationTask[NUMBER_OF_THREADS];
        Thread[] threads = new Thread[NUMBER_OF_THREADS];

        long startTime = System.currentTimeMillis();


        for (int i = 0; i < NUMBER_OF_THREADS; i++) {
            int start = i * chunkSize;
            int end = (i == NUMBER_OF_THREADS - 1) ? ARRAY_SIZE : start + chunkSize;
            tasks[i] = new SummationTask(array, start, end);
            threads[i] = new Thread(tasks[i]);
            threads[i].start();
        }


        long totalSum = 0;
        for (int i = 0; i < NUMBER_OF_THREADS; i++) {
            try {
                threads[i].join();
                totalSum += tasks[i].getPartialSum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long endTime = System.currentTimeMillis();
        long timeTaken = endTime - startTime;


        System.out.println("Total Sum: " + totalSum);
        System.out.println("Time taken (ms): " + timeTaken);
    }
}