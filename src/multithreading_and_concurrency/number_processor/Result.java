package multithreading_and_concurrency.number_processor;

public class Result {

    private long sum;
    private int eventCount;
    private int max;

    public Result(long sum, int eventCount, int max) {
        this.sum = sum;
        this.eventCount = eventCount;
        this.max = max;
    }

    public long getSum() {
        return sum;
    }

    public int getEventCount() {
        return eventCount;
    }

    public int getMax() {
        return max;
    }
}
