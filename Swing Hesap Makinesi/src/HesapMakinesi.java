import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HesapMakinesi extends JFrame{
    private JPanel panel;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField;
    private JButton toplama;
    private JButton cıkarma;
    private JButton carpma;
    private JButton bolme;
    private JButton temizleButton;


    public HesapMakinesi() {
        add(panel);
        setSize(500,300);
        setTitle("Hesap Makinesi Ahmet Candan");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        toplama.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.valueOf(textField3.getText());
                int b = Integer.valueOf(textField2.getText());
                textField.setText(String.valueOf(a+b));

            }
        });
        cıkarma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.valueOf(textField3.getText());
                int b = Integer.valueOf(textField2.getText());
                textField.setText(String.valueOf(a-b));

            }
        });
        carpma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.valueOf(textField3.getText());
                int b = Integer.valueOf(textField2.getText());
                textField.setText(String.valueOf(a*b));
            }
        });
        bolme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.valueOf(textField3.getText());
                int b = Integer.valueOf(textField2.getText());
                textField.setText(String.valueOf((double)a/b));
            }
        });
        temizleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField3.setText("");
                textField2.setText("");
                textField.setText("");

            }
        });
    }
}
