package SteganographyLab.StegStudentCode;
import java.awt.Color;
public class Steganography {
    /**
     * Clear the lower (rightmost) two bits in a pixel.
     */
    public static void clearLow(Pixel p) {

    }
    public static Picture testClearLow(Picture p) {
        Picture a = new Picture();
        return a;
    }
    public static void main(String[] args) {
        Picture beach = new Picture ("beach.jpg");
        beach.explore();
        Picture copy = testClearLow(beach);
        copy.explore();
    }
}
