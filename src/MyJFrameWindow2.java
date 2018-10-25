import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyJFrameWindow2 extends JFrame {

    public MyJFrameWindow2()
    {
        setTitle("My own JFrame Application");
        setSize(300,200);
        addWindowListener(new WindowAdapter(){

            public void windowClosing(WindowEvent e) {
                int input = JOptionPane.showConfirmDialog(null, "Do you wish to close the window?","Close Window?",JOptionPane.YES_NO_OPTION);

                if(input == JOptionPane.YES_OPTION)
                {
                    System.exit(0);
                }

                else
                {
                    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                }

            }

            @Override
            public void windowIconified(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "Minimising the window");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "Restoring the window");
            }
            }
        );
        setVisible(true);
    }

   /* private class WindowEventHandler extends WindowAdapter
    {
        @Override
        public void windowClosing(WindowEvent e) {
            int input = JOptionPane.showConfirmDialog(null, "Do you wish to close the window?","Close Window?",JOptionPane.YES_NO_OPTION);

            if(input == JOptionPane.YES_OPTION)
            {
                System.exit(0);
            }

            else
            {
                setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            }

        }

        @Override
        public void windowIconified(WindowEvent e) {
            JOptionPane.showMessageDialog(null, "Minimising the window");
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            JOptionPane.showMessageDialog(null, "Restoring the window");
        }
    }*/

    public static void main(String[] args) {

        MyJFrameWindow2 myJFrame = new MyJFrameWindow2();

    }

}
