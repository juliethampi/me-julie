/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab_7;

import java.awt.*;

/**
 *
 * @author HP
 */
public class FontClass {
    public static void main(String arg[])
    {
        Font f;
        f = new Font ("TimesNewRoman", Font.BOLD+Font.ITALIC,12);
        String font = f.getName();
        int style = f.getStyle();
        int size = f.getSize();
        boolean bold = f.isBold();
        boolean normal = f.isPlain();
        boolean italic = f.isItalic();
        System.out.println("Font : " +font + "\n Style :  "+ style + "\n Size: "+ size + "\nBold : "+bold + "\n Italic : "+italic);
    }
    
}
