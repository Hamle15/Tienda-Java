
package com.raven.swing;

import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelListener;
import javax.swing.JTextArea;


public class AreaTexto extends JTextArea {
    
    public AreaTexto(){
        setEditable(false);
        setFocusable(false);
        setWrapStyleWord(true);
        setLineWrap(true);
        
    }

    @Override
    public synchronized void addMouseListener(MouseListener l) {
     
    }

    @Override
    public synchronized void addMouseMotionListener(MouseMotionListener l) {
      
    }

    @Override
    public synchronized void addMouseWheelListener(MouseWheelListener l) {
       
    }

    @Override
    public void addNotify() {
        
    }
    
    
    
    
    
    
    
    
    
}
