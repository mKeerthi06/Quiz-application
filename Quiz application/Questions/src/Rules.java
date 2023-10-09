import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Rules extends JFrame implements ActionListener {
    private static final Color WHITE= null;
    String name;
    JButton start, back;
    public Rules(String name){
        this.name= name;
        getContentPane().setBackground(WHITE);
        setLayout(null);

         JLabel heading = new JLabel("Welcome " + name + " to Engineering Minds!!");
        heading.setBounds(40, 40, 500,30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,20));
        add(heading);
        heading.setForeground(Color.BLUE);

         JLabel rules = new JLabel();
        rules.setBounds(40, 90, 700,350);
        rules.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,18));
        
        rules.setText(
            "<html>"+ 
                "1. You should answer the text with in the time given." + "<br><br>" +
                "2. You cannot revisit the question after timesup, so answer it before time ends." + "<br><br>" +
                "3. Don't try to choose multiple option, choose only one option." + "<br><br>" +
                "4. Your face must be visible to camera while attending the test." + "<br><br>" +
                "5. There must be good lighting where you sit to take the exam." + "<br><br>" +
                "6. Camera quality must be better for face detection." + "<br><br>" +
                "7. You should allow permission to camera and speaker to take this exam." + "<br><br>" +
                "8. Thankyou for going through rules." + "<br><br>" +
            "<html>"
        );
        add(rules);
        rules.setForeground(Color.BLACK);

        back = new JButton("Back");
        back.setBounds(200, 480, 150, 30);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("Take test");
        start.setBounds(400, 480, 150, 30);
        start.setBackground(Color.BLUE);
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800,600);
        setLocation(350,100);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new Rules("user");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==start){
        setVisible(false);
        new quiz(name);
       } 
       else{
        setVisible(false);
        new Login();
       }
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}