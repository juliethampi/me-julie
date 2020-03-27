/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab_7;

import java.awt.Color;

/**
 *
 * @author HP
 */
public class Colour {
    
    public static void main(String arg [ ])
{
Color rgb, hsb;

rgb = new Color (193,255,183);

int red, green, blue;
        
red = rgb.getRed ( );

green = rgb.getGreen ( );
blue = rgb.getBlue ( );
float x [ ] = {0.0f,0.0f,0.0f};
rgb.RGBtoHSB(red, green, blue, x);


System.out.println("rgb combination");

System.out.println("Red : "+ red + " Green: " + green + "Blue : "+ blue);

System.out.println("Hue : "+x[0]+ "Saturation: "+x[1] + "rightness: "+x[2]);

int r = rgb.HSBtoRGB (0.75f,0.2375f,0.95f);

System.out.println ("\n HSB Combination");

System.out.println("Red, Blue and Green Combination : "+ r);
}
}
