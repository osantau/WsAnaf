/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct.soft.file.filter;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Octavian Santau
 */
public class CustomFileFilter extends FileFilter {

    @Override
    public boolean accept(File f) {
       return f.getAbsolutePath().endsWith(".csv");
    }

    @Override
    public String getDescription() {
         return "CSV documents (*.csv)";
    }
    
}
