package ChatApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Server extends JFrame implements ActionListener{
    public static void main(String args[]){
        new Server();
    
        }

    Server(){
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(163, 216, 255));
        p1.setBounds(0,0,450,60);
        p1.setLayout(null);
        add(p1);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/arrow.png"));
        Image i2= i1.getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel back= new JLabel(i3);
        back.setBounds(5,20,25,25);
        p1.add(back);

        back.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent ae){
                System.exit(0);
            }
        });

        ImageIcon i4= new ImageIcon(ClassLoader.getSystemResource("icons/user1.png"));
        Image i5= i4.getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel pfp= new JLabel(i6);
        pfp.setBounds(45,5,50,50);
        p1.add(pfp);

        JLabel name = new JLabel("Pam");
        name.setBounds(110, 15, 100, 18);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        p1.add(name);

        JLabel status = new JLabel("Online");
        status.setBounds(110, 35, 100, 18);
        status.setForeground(Color.WHITE);
        status.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
        p1.add(status);

        JPanel a1 = new JPanel();
        a1.setBounds(5,75,440,570);
        a1.setBackground(new Color(253,255,194));
        add(a1);

        JTextField text = new JTextField();
        text.setBounds(5,655,310,40);
        text.setFont(new Font("SAN_SERIF",Font.PLAIN, 16));
        add(text);

        JButton send = new JButton("Send");
        send.setBounds(320,655,123,40);
        send.setBackground(new Color(255,118,206));
        send.setForeground(Color.WHITE);
        send.setFont(new Font("SAN_SERIF",Font.PLAIN, 16));
        add(send);

        setSize(450,700);
        getContentPane().setBackground(Color.WHITE);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){

    }
   
}
