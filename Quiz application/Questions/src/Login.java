import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;




public class Login extends JFrame implements ActionListener{
    JButton jbutton, back;
    JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg") );
        JLabel image = new JLabel(i1);
        image.setBounds(0,0, 400, 500);
        add(image);

        JLabel heading = new JLabel("Engineering minds!");
        heading.setBounds(450, 60, 500,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        add(heading);
        heading.setForeground(Color.BLUE);

        JLabel name = new JLabel("Enter your name");
        name.setBounds(555, 150, 300,20);
        name.setFont(new Font("Aerial",Font.BOLD,16));
        add(name);
        name.setForeground(Color.BLUE);

         tfname = new JTextField();
        tfname.setBounds(460,220, 300, 20);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,18));
        add(tfname);

         jbutton = new JButton("Rules");
        jbutton.setBounds(460, 280, 100, 20);
        jbutton.setBackground(Color.BLUE);
        jbutton.setForeground(Color.WHITE);
        jbutton.addActionListener(this);
        add(jbutton);

          back = new JButton("Back");
        back.setBounds(660, 280, 100, 20);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        
        setSize(900,500);
        setLocation(200,100 );
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new Login();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == jbutton)
        {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);

        }
        else if(e.getSource() == back)
        {
            setVisible(false);
        } 
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        
    }
    
}
