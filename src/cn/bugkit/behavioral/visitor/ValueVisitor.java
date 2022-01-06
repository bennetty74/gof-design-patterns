package cn.bugkit.behavioral.visitor;

/**
 * @author bugkit
 * @since 2022.1.6
 */
public class ValueVisitor implements Visitor{

    @Override
    public void visit(LinkedNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }


}
