package multithreading_and_concurrency.number_processor;

public class Main {

    public static void main(String[] args) throws Exception {

        int size = 10000000;
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++)
            numbers[i] = i + 1;

        NumberProcessor processor = new NumberProcessor();

        long startTime = System.currentTimeMillis();

        Result result = processor.processNumbers(numbers, 3);

        long endTime = System.currentTimeMillis();

        System.out.println("Total sum : " + result.getSum());
        System.out.println("Even numbers : " + result.getEventCount());
        System.out.println("Max number : " + result.getMax());

        System.out.println("Total time spent : " + (endTime - startTime) + " ms");
    }
}
