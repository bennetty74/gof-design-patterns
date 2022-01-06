package cn.bugkit.behavioral.strategy;

/**
 * @author bugkit
 * @since 2022.1.6
 */
public class MergeSortStrategy implements SortStrategy {

    @Override
    public void sort(int[] unsortedArray) {
        System.out.println("Sorted by merging strategy");
    }
}
