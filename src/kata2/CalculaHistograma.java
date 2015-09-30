package kata2;

public class CalculaHistograma {

    public static <T> Histogram<T> calculaHistograma(T[] vector) {
        Histogram<T> histogram = new Histogram<>();

        for (T key : vector) {
            histogram.increment(key);
        }

        return histogram;
    }
}
