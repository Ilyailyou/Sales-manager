import java.util.Arrays;

public class SalesManager {
    protected long[] sales;

    public SalesManager (long[] sales) {
        this.sales = sales;
    }
    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public long average() {
        long[] part = new long[sales.length - 2];
        Arrays.sort(sales);
        System.arraycopy(sales, 1, part, 0, part.length);
        long sum = 0;
        for (long cell : part) {
            sum += cell;
        }
        return sum / part.length;
    }
}
