package bridge;

/**
 * @author bugkit
 * @since 2021.12.30
 */
public class Button {
    /**
     * the background of button
     */
    private String background;
    /**
     * the font size of text on button
     */
    private int fontSize;
    /**
     * the font family of text on button
     */
    private String fontFamily;

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }
}
