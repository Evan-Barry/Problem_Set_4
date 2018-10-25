import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BicycleFrame extends JFrame {

    private JButton smileButton;
    private JButton frownButton;

    public BicycleFrame()
    {
        setSize(400,200);
        setLocation(100,200);
        setTitle("Bicycle Shop");

        ImageIcon iconBike = new ImageIcon("bicycle.png");
        setIconImage(iconBike.getImage());

        Container cPane = getContentPane();
        cPane.setLayout(new FlowLayout());

        ImageIcon iconSmile = new ImageIcon("smile.png");
        smileButton = new JButton(iconSmile);
        add(smileButton);
        smileButton.addActionListener(new ButtonListener());

        ImageIcon iconFrown = new ImageIcon("frown.png");
        frownButton = new JButton(iconFrown);
        add(frownButton);
        frownButton.addActionListener((new ButtonListener()));
    }

    private class ButtonListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == smileButton)
            {
                JOptionPane.showMessageDialog(null, "You clicked the smile button!");
            }

            else if(e.getSource() == frownButton)
            {
                JOptionPane.showMessageDialog(null, "You clicked the frown button");
            }
        }
    }

    public static void main(String[] args) {

        BicycleFrame bf1 = new BicycleFrame();
        bf1.setVisible(true);

    }

}
