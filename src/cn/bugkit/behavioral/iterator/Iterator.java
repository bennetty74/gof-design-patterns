package cn.bugkit.behavioral.iterator;

/**
 * @author bugkit
 * @since 2022.1.5
 */
public interface Iterator<E> {
    /**
     * Test whether the iterator has next element
     * @return true if has, false else
     */
    boolean hasNext();

    /**
     * Get the next element
     * @return the next element
     */
    E next();
}
