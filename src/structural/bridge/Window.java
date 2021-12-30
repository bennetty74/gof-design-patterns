package structural.bridge;

/**
 * @author bugkit
 * @since 2021.12.30
 */
public interface Window {
    /**
     * Set the theme of window
     * @param theme the theme properties of each window
     */
    void setTheme(Theme theme);

    /**
     * render the window
     */
    void render();
}
