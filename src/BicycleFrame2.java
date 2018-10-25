import javax.swing.*;
import java.awt.*;

public class BicycleFrame2 extends JFrame {

    public BicycleFrame2()
    {
            setSize(400,200);
            setLocation(100,200);
            setTitle("Bicycle Shop");
            ImageIcon icon = new ImageIcon("bicycle.png");
            setIconImage(icon.getImage());
            getContentPane().setBackground(Color.red);
    }

    public static void main(String[] args) {

        BicycleFrame2 bf1 = new BicycleFrame2();
        bf1.setVisible(true);

    }

}
