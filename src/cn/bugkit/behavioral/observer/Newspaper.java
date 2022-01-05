package cn.bugkit.behavioral.observer;

/**
 * @author bugkit
 * @since 2022.1.5
 */
public class Newspaper {
    /**
     * newspaper content
     */
    private String content;

    public Newspaper(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "content='" + content + '\'' +
                '}';
    }
}
