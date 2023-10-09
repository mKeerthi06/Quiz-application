import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class score extends JFrame implements ActionListener{
        score(String name, int score){
        
        setBounds(300,100,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png") );
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,200, 300, 250);
        add(image);

        JLabel heading = new JLabel("Thankyou " + name + " for attending quiz!!");
        heading.setBounds(35,50,500,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(heading);

        JLabel lblScore = new JLabel("Your score is " + score);
        lblScore.setBounds(35,100,200,30);
        lblScore.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lblScore);

        JButton Submit = new JButton("Play again");
        Submit.setBounds(200, 100, 200, 30);
        Submit.setBackground(Color.BLUE);
        Submit.setFont(new Font("Times new roman",Font.PLAIN,18));
        Submit.setForeground(Color.WHITE);
        Submit.setEnabled(true);
        Submit.addActionListener(this);
        add(Submit);

        setVisible(true);

        }
        public static void main(String[] args){
            new score("user", 0);
        }
        @Override
        public void actionPerformed(ActionEvent e) {
           setVisible(false);
           new Login();
           
        }
    }
    

