package cn.bugkit.behavioral.iterator;

/**
 * @author bugkit
 * @since 2022.1.5
 */
public class IteratorTest {
    public static void main(String[] args) {
        FilmList filmList = new FilmList(new Film[]{new Film("film1", 120),
                new Film("film2", 99), new Film("film3", 88)});
        while (filmList.hasNext()) {
            System.out.println(filmList.next());
        }
    }
}
