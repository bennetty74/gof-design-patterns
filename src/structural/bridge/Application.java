package structural.bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * Change the theme of application which contains many windows
 * @author bugkit
 * @since 2021.12.30
 */
public class Application {

    private final List<Window> windows = new ArrayList<>();

    public List<Window> getWindows() {
        return windows;
    }

    public void render() {
        for (Window window : windows) {
            window.render();
        }
    }

    public static void main(String[] args) {
        Application application = new Application();
        // add window and set theme
        Theme theme = new Theme();
        HomeWindow homeWindow = new HomeWindow();
        homeWindow.setTheme(theme);
        ProfileWindow profileWindow = new ProfileWindow();
        profileWindow.setTheme(theme);
        application.getWindows().add(homeWindow);
        application.getWindows().add(profileWindow);
        // render
        application.render();
    }
}
