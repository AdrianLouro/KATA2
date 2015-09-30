package kata2;

import java.util.HashMap;

public class Histogram {

    private final int[] array;

    public Histogram(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public HashMap<Integer, Integer> getHistogram() {
        HashMap<Integer, Integer> histogram = new HashMap();

        for (int key : this.array) {
            histogram.put(key,
                    (histogram.containsKey(key) ? histogram.get(key) : 0) + 1);
        }

        return histogram;
    }
}
