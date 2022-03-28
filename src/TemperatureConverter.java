import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverter extends JFrame {
    private JPanel JPanel;
    private JTextField FtoCtext;
    private JTextField CtoFtext;
    private JButton FtoC;
    private JButton CtoF;
    private JLabel FtoClabel;
    private JLabel CtoFlabel;

    public TemperatureConverter(String title)
    {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(JPanel);
        this.pack();

        FtoC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempF = (int)(Double.parseDouble(FtoCtext.getText()));
                tempF = tempF - 32;
                tempF = tempF * 5;
                tempF = tempF / 9;
                FtoClabel.setText(tempF + " C");
            }
        });
        CtoF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempC = (int)((Double.parseDouble(CtoFtext.getText()))
                        * 1.8 + 32);
                CtoFlabel.setText(tempC + " F");
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new TemperatureConverter("Testing");
        frame.setVisible(true);
    }
}
