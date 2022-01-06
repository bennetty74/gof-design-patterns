package cn.bugkit.behavioral.visitor;

/**
 * @author bugkit
 * @since 2022.1.6
 */
public class VisitorTest {
    public static void main(String[] args) {
        LinkedNode head = new LinkedNode(1);
        head.next = new LinkedNode(2);
        // get each node's value
        head.accept(new ValueVisitor());
        // get sum of all nodes
        head.accept(new SumVisitor());
    }
}
