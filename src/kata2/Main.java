package kata2;

public class Main {

    public static void main(String[] args) {
        Histogram<Integer> histogram = CalculaHistograma.calculaHistograma(new Integer[]{1, 4, 7, 1, 1, 8, 4, 1, 4, 9});
        Histogram<String> histogram2 = CalculaHistograma.calculaHistograma(new String[]{"Ana", "Juan", "Pedro", "Ana", "Juan", "Ana", "Juan"});

        for (Object key : histogram.keySet()) {
            System.out.println(key + "->" + histogram.get(key));
        }

        System.out.println("");

        for (Object key : histogram2.keySet()) {
            System.out.println(key + "->" + histogram2.get(key));
        }

    }
}
