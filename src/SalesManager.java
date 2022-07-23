import java.util.Arrays;

public class SalesManager {
    protected int[] sales;

    public SalesManager (int[] sales) {
        this.sales = sales;
    }
    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int average() {
        int[] part = new int[sales.length - 2];
        Arrays.sort(sales);
        System.arraycopy(sales, 1, part, 0, part.length);
        int sum = 0;
        for (int cell : part) {
            sum += cell;
        }
        return  sum / part.length;
    }
}
