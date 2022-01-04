package cn.bugkit.structural.bridge;

/**
 * @author bugkit
 * @since 2021.12.30
 */
public class HomeWindow implements Window {

    private Theme theme;
    private Button button;

    public HomeWindow() {
        this.button = new Button();
    }

    @Override
    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    @Override
    public void render() {

    }


}
