/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct.soft.util;

import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 *
 * @author osantau
 */
public class LocaleUtil {
 
    public static char getPatternSeparator() {
        Locale currentLocale = Locale.getDefault();
         DecimalFormatSymbols formatSymbols = new DecimalFormatSymbols();
       return formatSymbols.getPatternSeparator();
    }
}
