import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class Lab_15 extends JFrame {
        JLabel jlabel;
        private JTextField txt;
        final JButton but1;
        final JButton but2;
        private JButton but3;

        Lab_15(){
            super("Счетчик от -5 до 3");
            setSize(350,350);
            setLayout(null);
            JTextField a= new JTextField();
            a.setText("0");
            a.setBounds(70,60,70,25);
            a.setEditable(false);
            jlabel= new JLabel("Число");
            jlabel.setBounds(25,60,60,25);
            but1 = new JButton("+1");
            but1.setBounds(200,80,60,25);
            but2 = new JButton("-1");
            but2.setBounds(200,40,60,25);
            add(a);
            add(jlabel);
            add(but1);
            add(but2);
            setVisible(true);
            but1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (Integer.parseInt(a.getText())<3)
                        a.setText(Integer.toString(Integer.parseInt(a.getText())+1));
                    else{
                        System.out.println();
                    }
                }
            });
            but2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (Integer.parseInt(a.getText())>-5)
                        a.setText(Integer.toString(Integer.parseInt(a.getText())-1));
                    else{
                        System.out.println();
                    }
                }
            });
        }
        public static void main(String[] args) {
            Lab_15 n = new Lab_15();
        }
    }
