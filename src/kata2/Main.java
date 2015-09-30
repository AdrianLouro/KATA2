package kata2;

public class Main {

    public static void main(String[] args) {
        Histogram histogram = new Histogram(new int[]{1, 4, 7, 1, 1, 8, 4, 1, 4, 9});
        System.out.println(histogram.getHistogram());
    }
}
