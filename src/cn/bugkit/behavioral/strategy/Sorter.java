package cn.bugkit.behavioral.strategy;

/**
 * @author bugkit
 * @since 2022.1.6
 */
public class Sorter {

    private SortStrategy strategy;

    public Sorter(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(int[] unsortedArray) {
        strategy.sort(unsortedArray);
    }
}
