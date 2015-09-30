package kata2;

public class Main {

    public static void main(String[] args) {
        Histogram histogram = new Histogram(new Integer[]{1, 4, 7, 1, 1, 8, 4, 1, 4, 9});
        System.out.println(histogram.getHistogram());

        Histogram histogram2 = new Histogram(new String[]{"Ana", "Juan", "Pedro", "Ana", "Juan", "Ana", "Juan"});
        System.out.println(histogram2.getHistogram());

    }
}
