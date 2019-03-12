
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TimerTest {
    public static void main(String [] args){
    	
        Timer timer = new Timer(1000, new ActionListener(){
            public void actionPerformed(ActionEvent event) {
            	System.out.println("Hello world!");
            }
        });
        while(true) {
        	timer.start();	
        }
    }
}