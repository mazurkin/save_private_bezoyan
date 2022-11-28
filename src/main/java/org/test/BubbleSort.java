package org.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class BubbleSort implements Sort {

    public static final Sort INSTANCE = new BubbleSort();

    private BubbleSort() {
        // singleton
    }

    @Override
    public <T extends Comparable<T>> List<T> sort(Collection<T> items, Comparator<T> comparator) {
        List<T> buffer = new ArrayList<>(items);

        for (int loop1 = 0, limit1 = buffer.size() - 1; loop1 < limit1; loop1++) {
            for (int loop2 = 0, limit2 = buffer.size() - 1 - loop1; loop2 < limit2; loop2++) {
                T item1 = buffer.get(loop2);
                T item2 = buffer.get(loop2 + 1);

                if (comparator.compare(item1, item2) > 0) {
                    buffer.set(loop2, item2);
                    buffer.set(loop2 + 1, item1);
                }
            }
        }

        return buffer;
    }
}
