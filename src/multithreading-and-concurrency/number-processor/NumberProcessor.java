package multithreading_and_concurrency.number_processor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NumberProcessor {

    public Result processNumbers(int[] numbers, int threadCount) throws Exception {

        ExecutorService executorService = Executors.newFixedThreadPool(threadCount);

        List<Future<Result>> futures = new ArrayList<>();
        int size = numbers.length;
        int chunk = size / threadCount;
        int start = 0;

        for (int i = 0; i < threadCount; i++) {

            int end;
            if (i == threadCount - 1) {
                end = size;
            } else {
                end = start + chunk;
            }

            NumberTask task = new NumberTask(numbers, start, end);

            Future<Result> future = executorService.submit(task);
            futures.add(future);

            start = end;

        }

        long finalSum = 0;
        int finalEven = 0;
        int finalMax = Integer.MIN_VALUE;

        for (Future<Result> future : futures) {

            Result result = future.get();

            finalSum += result.getSum();
            finalEven += result.getEventCount();
            finalMax = Math.max(finalMax, result.getMax());
        }

        executorService.shutdown();

        return new Result(finalSum, finalEven, finalMax);
    }
}