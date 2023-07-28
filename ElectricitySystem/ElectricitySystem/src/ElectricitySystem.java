import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ElectricitySystem {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton calculateButton;
    private JPanel MainPanel;
    private JTextArea textarea;
    JFrame frame=new JFrame();
    double charge,gtotal;
    int unit;
    String cid;


    public void print()
    {
        String billid = textField1.getText();
        String customer = textField2.getText();
        unit = Integer.parseInt(textField3.getText());

        textarea.setText(textarea.getText() + "\n");
        textarea.setText( textarea.getText() + "Electricity Billing System" + "\n" +"\n");
        textarea.setText( textarea.getText() + "\n");
        textarea.setText( textarea.getText() + "Bill No : - "  + billid + "\n");
        textarea.setText( textarea.getText() + "\n");
        textarea.setText( textarea.getText() + "Customer : - " + customer + "\n");
        textarea.setText( textarea.getText() + "\n");
        textarea.setText( textarea.getText() + "Unit  : - " + unit + "\n");
        textarea.setText( textarea.getText() + "\n");
        textarea.setText( textarea.getText() + "Amount  : - " + gtotal + "\n");
    }


    public ElectricitySystem() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(MainPanel);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(true);
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cid = textField1.getText();
                unit = Integer.parseInt(textField3.getText());

                if(unit < 200)
                {
                    charge = 2.00;
                }
                else if(unit < 200 && unit< 400)
                {
                    charge = 4.00;
                }
                else if(unit < 400 && unit< 800)
                {
                    charge = 6;
                }
                else
                {
                    charge = 8.00;
                }

                gtotal = unit * charge;


                print();

            }
        });
    }

    public static void main(String[] args) {
        new ElectricitySystem();
    }


}
