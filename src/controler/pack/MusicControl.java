
package controler.pack;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author Karol
 */
public class MusicControl 
{
    
    private FileInputStream fileInputStream = null;
    private BufferedInputStream bufferedInputStream = null;
    private Player player;
    private long pauseLocation;
    private long totalLenght;
    
    private String pathMusic;
    
    public void playMusic(String path)
    {
     if(path!=null)
     {
        try 
        {
            fileInputStream = new FileInputStream(path);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            
           player = new Player(bufferedInputStream);
           
              totalLenght = fileInputStream.available();
              pathMusic = path + "";
              
        } catch (FileNotFoundException | JavaLayerException ex ) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error file not found", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(MusicControl.class.getName()).log(Level.SEVERE, null, ex);
        }

        new Thread()
        {
            @Override
            public void run() 
            {
                try 
                {
                    player.play();
                } catch (JavaLayerException ex) {
                     JOptionPane.showMessageDialog(null, ex.getMessage(), "Error layer", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }.start();
     }
    }
    
     public void resumeMusic()
    {
  
        try 
        {
            fileInputStream = new FileInputStream(pathMusic);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            
           player = new Player(bufferedInputStream);
           fileInputStream.skip(totalLenght - pauseLocation);
         
            
        } catch (FileNotFoundException | JavaLayerException ex ) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error file not found", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error IO", JOptionPane.INFORMATION_MESSAGE);
        }

        new Thread()
        {
            @Override
            public void run() 
            {
                try 
                {
                    player.play();
                } catch (JavaLayerException ex) 
                {
                     JOptionPane.showMessageDialog(null, ex.getMessage(), "Error layer", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }.start();
          
    }
    
    public void stopMusic()
    {
        
        if(player !=null)
        {
            player.close();
        }
    }
    
    public void pauseMusic()
    {
        if(player != null)
        {
            try 
            {
                pauseLocation = fileInputStream.available();
                player.close();
            } catch (IOException ex) 
            {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error IO", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    public void rightScroll(int length)
    {
    if(player != null) 
    {
        try {
                try
                {
                    pauseLocation = fileInputStream.available() - length;
                    player.close();
                } catch (IOException ex)
                {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error IO", JOptionPane.INFORMATION_MESSAGE);
                }
           
            fileInputStream = new FileInputStream(pathMusic);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            
            player = new Player(bufferedInputStream);
            fileInputStream.skip(totalLenght - pauseLocation);
            
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MusicControl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JavaLayerException | IOException ex) {
            Logger.getLogger(MusicControl.class.getName()).log(Level.SEVERE, null, ex);
        }
         
          new Thread()
        {
            @Override
            public void run() 
            {
                try 
                {
                    player.play();
                } catch (JavaLayerException ex) 
                {
                     JOptionPane.showMessageDialog(null, ex.getMessage(), "Error layer", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }.start();
    }
        
    }
    
     public void leftScroll(int length)
    {
        try {
            if(player != null) 
            {
                try
                {
                    pauseLocation = fileInputStream.available() + length;
                    player.close();
                } catch (IOException ex)
                {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error IO", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            fileInputStream = new FileInputStream(pathMusic);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            
            player = new Player(bufferedInputStream);
            if((totalLenght - pauseLocation) <= 0)
            {  
            fileInputStream.skip(totalLenght);
            }
            else
               fileInputStream.skip(totalLenght - pauseLocation);
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MusicControl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JavaLayerException | IOException ex) {
            Logger.getLogger(MusicControl.class.getName()).log(Level.SEVERE, null, ex);
        }
         
          new Thread()
        {
            @Override
            public void run() 
            {
                try 
                {
                    player.play();
                } catch (JavaLayerException ex) 
                {
                     JOptionPane.showMessageDialog(null, ex.getMessage(), "Error layer", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }.start();
        
    }
    
}
