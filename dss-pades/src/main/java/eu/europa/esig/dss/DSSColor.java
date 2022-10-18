package eu.europa.esig.dss;

import android.graphics.Color;

import com.tom_roush.harmony.awt.AWTColor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DSSColor implements Serializable {
    private AWTColor awtColor;

    /**
     * The color white.
     */
    public final static DSSColor white = new DSSColor(255, 255, 255);

    /**
     * The color white.
     */
    public final static DSSColor WHITE = white;

    /**
     * The color light gray.
     */
    public final static DSSColor lightGray = new DSSColor(192, 192, 192);

    /**
     * The color light gray.
     */
    public final static DSSColor LIGHT_GRAY = lightGray;

    /**
     * The color gray.
     */
    public final static DSSColor gray = new DSSColor(128, 128, 128);

    /**
     * The color gray.
     */
    public final static DSSColor GRAY = gray;

    /**
     * The color dark gray.
     */
    public final static DSSColor darkGray = new DSSColor(64, 64, 64);

    /**
     * The color dark gray.
     */
    public final static DSSColor DARK_GRAY = darkGray;

    /**
     * The color black.
     */
    public final static DSSColor black = new DSSColor(0, 0, 0);

    /**
     * The color black.
     */
    public final static DSSColor BLACK = black;

    /**
     * The color red.
     */
    public final static DSSColor red = new DSSColor(255, 0, 0);

    /**
     * The color red.
     */
    public final static DSSColor RED = red;

    /**
     * The color pink.
     */
    public final static DSSColor pink = new DSSColor(255, 175, 175);

    /**
     * The color pink.
     */
    public final static DSSColor PINK = pink;

    /**
     * The color orange.
     */
    public final static DSSColor orange = new DSSColor(255, 200, 0);

    /**
     * The color orange.
     */
    public final static DSSColor ORANGE = orange;

    /**
     * The color yellow.
     */
    public final static DSSColor yellow = new DSSColor(255, 255, 0);

    /**
     * The color yellow.
     */
    public final static DSSColor YELLOW = yellow;

    /**
     * The color green.
     */
    public final static DSSColor green = new DSSColor(0, 255, 0);

    /**
     * The color green.
     */
    public final static DSSColor GREEN = green;

    /**
     * The color magenta.
     */
    public final static DSSColor magenta = new DSSColor(255, 0, 255);

    /**
     * The color magenta.
     */
    public final static DSSColor MAGENTA = magenta;

    /**
     * The color cyan.
     */
    public final static DSSColor cyan = new DSSColor(0, 255, 255);

    /**
     * The color cyan.
     */
    public final static DSSColor CYAN = cyan;

    /**
     * The color blue.
     */
    public final static DSSColor blue = new DSSColor(0, 0, 255);

    /**
     * The color blue.
     */
    public final static DSSColor BLUE = blue;

    public int color;


    public DSSColor() {

    }

    /**
     * Creates an DSSColor from a color int
     *
     * @param c The color integer
     */
    public DSSColor(int c) {
        this.awtColor = new AWTColor(c);
    }

    /**
     * Creates an DSSColor with the specified RGB values that is fully opaque
     *
     * @param r The red component
     * @param g The green component
     * @param b The blue component
     */
    public DSSColor(int r, int g, int b) {
        this.awtColor = new AWTColor(r, g, b, 255);
    }

    /**
     * Creates an DSSColor with the specified RGBA values
     *
     * @param r The red component
     * @param g The green component
     * @param b The blue component
     * @param a The alpha component
     */
    public DSSColor(int r, int g, int b, int a)
    {
        this.awtColor = new AWTColor(r, g, b, a);
    }

    public DSSColor(float r, float g, float b, float a)
    {
        color = Color.argb( (int) (a * 255.0f), (int) (r * 255.0f), (int) (g * 255.0f), (int) (b * 255.0f));
        this.awtColor = new AWTColor(color);
    }

    /**
     * Creates an DSSColor with the specified RGB values
     *
     * @param r The red component as a float in the range (0.0f - 1.0f)
     * @param g The green component as a float in the range (0.0f - 1.0f)
     * @param b The blue component as a float in the range (0.0f - 1.0f)
     */
    public DSSColor(float r, float g, float b)
    {
        this.awtColor = new AWTColor(r, g, b);
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeObject(color);
    }

    public int getRed()
    {
        return this.awtColor.getRed();
    }

    /**
     * Returns the green component of this color
     *
     * @return the value of the green component
     */
    public int getGreen()
    {
        return this.awtColor.getGreen();
    }

    /**
     * Returns the blue component of this color
     *
     * @return the value of the blue component
     */
    public int getBlue()
    {
        return this.awtColor.getBlue();
    }

    /**
     * Returns the alpha component of this color
     *
     * @return the value of the alpha component
     */
    public int getAlpha()
    {
        return this.awtColor.getAlpha();
    }

    private void readObject(ObjectInputStream in) throws IOException {
        try {
            int color = (Integer) in.readObject();
            this.awtColor = new AWTColor(color);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public AWTColor getAwtColor() {
        return awtColor;
    }
}
