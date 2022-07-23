public class Main {

    public static void main(String[] args) {
        long[] array = {0, 50, 100};
        SalesManager salesManager = new SalesManager(array);
        System.out.println(salesManager.max());
    }
}
