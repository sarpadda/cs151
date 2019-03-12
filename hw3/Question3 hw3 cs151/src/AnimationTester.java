import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

/**
   This program implements an animation that moves
   a car shape.
*/
public class AnimationTester
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      final ArrayList<MoveableShape> shapes=new ArrayList<MoveableShape>();
      
      final MoveableShape shape= new CarShape(0, 0, CAR_WIDTH);
      final MoveableShape shape1= new CarShape(0, 70, CAR_WIDTH);
      final MoveableShape shape2= new CarShape(0,140, CAR_WIDTH);

      
      shapes.add(shape);
      shapes.add(shape1);
      shapes.add(shape2);

  
      
 
          ShapeIcon icon = new ShapeIcon(shapes,
                  ICON_WIDTH, ICON_HEIGHT);

            final JLabel label = new JLabel(icon);

            frame.setLayout(new FlowLayout());
            frame.add(label);
      
      

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);

      final int DELAY = 10;
      // Milliseconds between timer ticks
      Timer t = new Timer(DELAY, event ->
         {
            
        	 for(int i=0; i<shapes.size();i++) {
             shapes.get(i).move();
           	 label.repaint();
        	 }


           
         });
      
      t.start();
      
   }

   private static final int ICON_WIDTH = 400;
   private static final int ICON_HEIGHT =200;
   private static final int CAR_WIDTH = 100;
}