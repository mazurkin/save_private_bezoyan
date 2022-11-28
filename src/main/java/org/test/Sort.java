package org.test;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/**
 * Sort algorithm abstraction for objects
 */
public interface Sort {

    /**
     * Sort the collection and returns the sorted list of items using a custom comparator
     * @param items The original collection of items
     * @param comparator Comparator
     * @return The sorted list
     * @param <T> Item's type
     */
    <T extends Comparable<T>> List<T> sort(Collection<T> items, Comparator<T> comparator);

    /**
     * Sort the collection and returns the sorted list of items using a custom comparator
     * @param items The original collection of items
     * @return The sorted list
     * @param <T> Item's type
     */
    default <T extends Comparable<T>> List<T> sort(Collection<T> items) {
        return sort(items, Comparator.naturalOrder());
    }

}
