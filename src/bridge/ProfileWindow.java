package bridge;

/**
 * @author bugkit
 * @since 2021.12.30
 */
public class ProfileWindow implements Window{

    private NavigationBar navigationBar;
    private Theme theme;

    public ProfileWindow() {
        navigationBar = new NavigationBar();
    }

    @Override
    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    @Override
    public void render() {
        navigationBar.setBackground(theme.getPrimaryColor());
    }
}
