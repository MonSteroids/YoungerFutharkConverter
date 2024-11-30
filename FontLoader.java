import java.awt.*;
import java.io.File;

public class FontLoader {
    public static Font loadCustomFont(String fontPath, float fontSize) {
        try {
            // Load the font from the specified path
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPath));
            return customFont.deriveFont(fontSize); // Set the desired font size
        }
        catch (Exception e) {
            e.printStackTrace();
            return new Font("SansSerif", Font.PLAIN, (int) fontSize); // Fallback font
        }
    }
}
