package SteganographyLab.StegStudentCode;
import java.awt.Color;
import static java.lang.System.out;

public class Steganography {
    /**
     * Clear the lower (rightmost) two bits in a pixel.
     */
    public static void clearLow(Pixel p) {
        p.setRed((p.getRed() / 4) * 4);
        p.setBlue((p.getBlue() / 4) * 4);
        p.setGreen((p.getGreen() / 4) * 4);
    }
    public static Picture testClearLow(Picture p) {
        Picture a = new Picture(p);
        for (int i = 0; i < a.getHeight(); i++) {
            for (int j = 0; j < a.getWidth(); j++) {
                clearLow(a.getPixel(j, i));
            }
        }
        return a;
    }

    public static void setLow(Pixel p, Color c) {
        clearLow(p);
        p.setRed(p.getRed() + (c.getRed()/64));
        p.setBlue(p.getBlue() + (c.getBlue()/64));
        p.setGreen(p.getGreen() + (c.getGreen()/64));
    }

    public static Picture testSetLow(Picture p, Color a) {
        Picture picture = new Picture(p);
        for (int i = 0; i < picture.getHeight(); i++) {
            for (int j = 0; j < picture.getWidth();j++) {
                setLow(picture.getPixel(j, i), a);
            }
        }
        return picture;
    }

    public static Picture revealPicture(Picture hidden) {
        Picture copy = new Picture(hidden);
        Pixel[][] pixels = copy.getPixels2D();
        Pixel[][] source = hidden.getPixels2D();
        for (int r = 0; r < pixels.length; r++) {
            for (int c = 0; c < pixels[0].length;c++) {
                Color col = source[r][c].getColor();
                pixels[r][c].setRed(pixels[r][c].getRed() % 64 + col.getRed() % 4 * 64);
                pixels[r][c].setBlue(pixels[r][c].getBlue() % 64 + col.getBlue() % 4 * 64);
                pixels[r][c].setGreen(pixels[r][c].getGreen() % 64 + col.getGreen() % 4 * 64);
            }
        }
        return copy;
    }

    public static boolean canHide(Picture source, Picture secret) {
        if (source.getWidth() == secret.getWidth() && source.getHeight() == secret.getHeight()) return true;
        return false;
    }

    public static Picture hidePicture(Picture source, Picture secret) {
        if (canHide(source, secret)) {
            Picture picture = new Picture(source);

            Pixel[][] sourcePixels = picture.getPixels2D();
            Pixel[][] secretPixels = secret.getPixels2D();
            for (int r = 0; r < sourcePixels.length; r++) {
                for (int  c= 0; c < sourcePixels.length; c++) {
                    setLow(sourcePixels[r][c], secretPixels[r][c].getColor());
                }
            }
            return picture;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Picture beach = new Picture ("beach.jpg");
        Picture beach2 = new Picture("beach.jpg");
        Picture arch = new Picture("arch.jpg");
        Picture blueMotorcycle = new Picture("blueMotorcycle.jpg");

        Picture copy2 = testSetLow(beach2, Color.pink);
        //copy2.explore();
        copy2 = testClearLow(beach2);

        Picture copy3 = revealPicture(copy2);

        out.println(canHide(beach, arch));
        out.println(canHide(beach, blueMotorcycle));

        Picture test = hidePicture(beach, blueMotorcycle);

        beach2.explore();
        blueMotorcycle.explore();
        test.explore();
    }
}
