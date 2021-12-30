package structural.bridge;

/**
 * @author bugkit
 * @since 2021.12.30
 */
public class Theme {
    /**
     * the primary color of application
     */
    private String primaryColor;
    /**
     * the primary font size
     */
    private int fontSize;
    /**
     * the font family of application
     */
    private String fontFamily;

    public String getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
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
