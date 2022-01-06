package cn.bugkit.behavioral.visitor;

/**
 * Get the sum of {@link LinkedNode}
 * @author bugkit
 * @since 2022.1.6
 */
public class SumVisitor implements Visitor{
    @Override
    public void visit(LinkedNode head) {
        int sum = 0;
        while (head != null) {
            sum += head.val;
            head = head.next;
        }
        System.out.println("Sum is: " + sum);
    }
}
