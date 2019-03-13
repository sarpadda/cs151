
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TimerTest {
    public static void main(String [] args){
    	 JFrame frame = new JFrame();
    		int delay=1000;
        Timer timer = new Timer(delay, new ActionListener(){
            public void actionPerformed(ActionEvent event) {
            	System.out.println("Hello world!");
            }
        });
        
         	timer.start();           
    }
}