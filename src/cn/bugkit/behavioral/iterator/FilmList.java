package cn.bugkit.behavioral.iterator;

/**
 * @author bugkit
 * @since 2022.1.5
 */
public class FilmList implements Iterator<Film> {

    /**
     * the film list
     */
    private final Film[] films;

    /**
     * the current cursor of iterator
     */
    private int cursor;

    public FilmList(Film[] films) {
        this.films = films;
    }

    @Override
    public boolean hasNext() {
        return cursor < films.length;
    }

    @Override
    public Film next() {
        return films[cursor++];
    }
}
