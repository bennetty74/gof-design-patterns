package cn.bugkit.behavioral.strategy;

/**
 * @author bugkit
 * @since 2022.1.6
 */
public class StrategyTest {
    public static void main(String[] args) {
        int[] unsortedArray = new int[]{1, 3, 4};
        // merge sort strategy
        Sorter sorter = new Sorter(new MergeSortStrategy());
        sorter.sort(unsortedArray);

        // quick sort strategy
        sorter.setStrategy(new QuickSortStrategy());
        sorter.sort(unsortedArray);
    }
}
