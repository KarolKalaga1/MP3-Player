
package controler.pack;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author Karol
 */
public class FileControl {
    
    private final JFileChooser fc = new JFileChooser();
    private String path;
    
    public void openDialogBox(){
    
        int returnVal = fc.showOpenDialog(fc);
         
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            path = file.getPath();
        }
    }
    
    public String getPath(){
        return path;
    }
    
}
