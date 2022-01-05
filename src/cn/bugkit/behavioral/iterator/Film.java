package cn.bugkit.behavioral.iterator;

/**
 * @author bugkit
 * @since 2022.1.5
 */
public class Film {
    /**
     * film name
     */
    private final String name;
    /**
     * film duration
     */
    private final int duration;

    public Film(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }
}
