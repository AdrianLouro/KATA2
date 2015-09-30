package kata2;

import java.util.HashMap;

public class Histogram<T> {

    private final T[] array;

    public Histogram(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return this.array;
    }

    public HashMap<T, Integer> getHistogram() {
        HashMap<T, Integer> histogram = new HashMap();

        for (T key : this.array) {
            histogram.put(key,
                    (histogram.containsKey(key) ? histogram.get(key) : 0) + 1);
        }

        return histogram;
    }
}
