import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Random;

public class ButtonChaser extends JFrame{

    JButton button1;

    public ButtonChaser()
    {
        setTitle("The Button Chaser Application");
        setSize(275,170);
        setResizable(false);

        setLayout(new FlowLayout());

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        setLocation((int)((screenSize.getWidth()/2)-(275/2)),(int)((screenSize.getHeight()/2)-(170/2)));

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        button1 = new JButton("Press Me");

        button1.setMnemonic(KeyEvent.VK_P);

        button1.addActionListener(new ButtonListener());

        add(button1);
    }

    public static void main(String[] args) {

        ButtonChaser bc1 = new ButtonChaser();
        bc1.setVisible(true);

    }

    private class ButtonListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == button1)
            {
                System.out.println("Button 1 pressed");

                Random rnd = new Random();

                int rndX = rnd.nextInt((getWidth()-button1.getWidth()));
                int rndY = rnd.nextInt((getHeight() - button1.getHeight()));

                button1.setLocation(rndX, rndY);
            }
        }
    }

}
