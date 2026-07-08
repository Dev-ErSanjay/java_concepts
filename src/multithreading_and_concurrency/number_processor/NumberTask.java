package multithreading_and_concurrency.number_processor;

import java.util.concurrent.Callable;

public class NumberTask implements Callable<Result> {

    private int[] numbers;
    private int start;
    private int end;

    public NumberTask(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    public Result call() {

        long sum = 0;
        int eventCount = 0;
        int max = Integer.MIN_VALUE;

        for (int i = start; i < end; i++) {

            int value = numbers[i];

            sum += value;
            if (value % 2 == 0)
                eventCount++;
            if (value > max)
                max = value;

        }
        System.out.println(Thread.currentThread().getName()
                + " processed "
                + start
                + " to "
                + end);

        return new Result(sum, eventCount, max);
    }
}
