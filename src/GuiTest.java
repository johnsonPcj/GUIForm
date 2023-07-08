import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiTest {
    private JPanel PannelM;
    private JTree tree1;
    private JTree tree2;
    private JButton okButton;
    private JCheckBox checkBox1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JEditorPane editorPane1;
    private JTextPane textPane1;

    public GuiTest() {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GuiTest");
        frame.setContentPane(new GuiTest().PannelM);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
