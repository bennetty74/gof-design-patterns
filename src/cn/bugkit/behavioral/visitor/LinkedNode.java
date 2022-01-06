package cn.bugkit.behavioral.visitor;

/**
 * @author bugkit
 * @since 2022.1.6
 */
public class LinkedNode {

    /**
     * The value of node
     */
    int val;
    /**
     * The next node
     */
    LinkedNode next;

    public LinkedNode(int val) {
        this.val = val;
    }

    /**
     * Accept an visitor and do visit method
     * @param visitor {@link Visitor}
     */
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }





}
