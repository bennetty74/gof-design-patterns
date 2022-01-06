package cn.bugkit.behavioral.visitor;

/**
 * @author bugkit
 * @since 2022.1.6
 */
public interface Visitor {
    /**
     * Visit and print the values of {@link LinkedNode}
     * @param head the header of {@link LinkedNode}
     */
    void visit(LinkedNode head);
}
