
package PresentationTier;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;
public class LogIn extends JFrame implements ActionListener {
    private JLabel email,logIn,password,signUpField,uptField,uptLogo;
    private JTextField emailField;
    private JPanel jPanel1,left,right;
    private JButton logInButton,signUpButton;
    private JPasswordField passwordField;
    public LogIn() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new JPanel();
        left = new JPanel();
        uptLogo = new JLabel();
        uptField = new JLabel();
        right = new JPanel();
        logIn = new JLabel();
        email = new JLabel();
        password = new JLabel();
        emailField = new JTextField();
        passwordField = new JPasswordField();
        logInButton = new JButton();
        signUpField = new JLabel();
        signUpButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setBackground(new Color(102, 255, 51));

        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel1.setPreferredSize(new Dimension(800, 500));
        jPanel1.setLayout(null);

        left.setBackground(new Color(0, 102, 102));
        left.setPreferredSize(new Dimension(400, 500));

        uptLogo.setIcon(new ImageIcon("Images/logo.jpg")); 

        uptField.setBackground(new Color(0, 102, 102));
        uptField.setFont(new Font("Segoe UI Semibold", 1, 18)); 
        uptField.setForeground(new Color(255, 255, 255));
        uptField.setText("Universiteti Politeknik i Tiranes");

        GroupLayout leftLayout = new GroupLayout(left);
        left.setLayout(leftLayout);
        leftLayout.setHorizontalGroup(
            leftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, leftLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(leftLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(uptField,GroupLayout.PREFERRED_SIZE, 264,GroupLayout.PREFERRED_SIZE)
                    .addComponent(uptLogo))
                .addGap(54, 54, 54))
        );
        leftLayout.setVerticalGroup(
            leftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(leftLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(uptLogo)
                .addGap(34, 34, 34)
                .addComponent(uptField,GroupLayout.PREFERRED_SIZE, 75,GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jPanel1.add(left);
        left.setBounds(0, 0, 380, 500);
        left.getAccessibleContext().setAccessibleDescription("");

        right.setBackground(new Color(255, 255, 255));
        right.setForeground(new Color(0, 102, 102));
        right.setMinimumSize(new Dimension(400, 500));

        logIn.setFont(new Font("Segoe UI", 1, 36)); 
        logIn.setForeground(new Color(0, 102, 102));
        logIn.setText("LOGIN");

        email.setBackground(new Color(153, 153, 153));
        email.setFont(new Font("Segoe UI", 0, 16)); 
        email.setText("Email");

        password.setBackground(new Color(153, 153, 153));
        password.setFont(new Font("Segoe UI", 0, 16));
        password.setText("Password");

        emailField.setFont(new Font("Segoe UI", 0, 16)); 
        emailField.setForeground(new Color(102, 102, 102));


        logInButton.setBackground(new Color(0, 102, 102));
        logInButton.setFont(new Font("Segoe UI", 0, 14)); 
        logInButton.setForeground(new Color(255, 255, 255));
        logInButton.setText("Login");
        logInButton.addActionListener(this);
        signUpField.setFont(new Font("Segoe UI", 0, 14)); 
        signUpField.setText("I don't have an account");
        signUpButton.setFont(new Font("Segoe UI", 0, 14)); 
        signUpButton.setForeground(new Color(204, 0, 0));
        signUpButton.setText("Sign Up");
        signUpButton.addActionListener(this);
        GroupLayout rightLayout = new GroupLayout(right);
        right.setLayout(rightLayout);
        rightLayout.setHorizontalGroup(
            rightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(rightLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(rightLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(logInButton,GroupLayout.Alignment.LEADING,GroupLayout.PREFERRED_SIZE, 88,GroupLayout.PREFERRED_SIZE)
                    .addGroup(GroupLayout.Alignment.LEADING, rightLayout.createSequentialGroup()
                        .addComponent(signUpField,GroupLayout.PREFERRED_SIZE, 172,GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signUpButton,GroupLayout.PREFERRED_SIZE, 88,GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, rightLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(rightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, rightLayout.createSequentialGroup()
                        .addComponent(logIn,GroupLayout.PREFERRED_SIZE, 122,GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))
                    .addGroup(GroupLayout.Alignment.TRAILING, rightLayout.createSequentialGroup()
                        .addGroup(rightLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(emailField,GroupLayout.PREFERRED_SIZE, 321,GroupLayout.PREFERRED_SIZE)
                            .addGroup(rightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(password)
                                .addComponent(passwordField,GroupLayout.PREFERRED_SIZE, 321,GroupLayout.PREFERRED_SIZE)
                                .addComponent(email)))
                        .addGap(45, 45, 45))))
        );
        rightLayout.setVerticalGroup(
            rightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(rightLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(logIn)
                .addGap(47, 47, 47)
                .addComponent(email)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailField,GroupLayout.PREFERRED_SIZE,35,GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField,GroupLayout.PREFERRED_SIZE, 35,GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(logInButton,GroupLayout.PREFERRED_SIZE, 32,GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(rightLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(signUpField,GroupLayout.PREFERRED_SIZE, 32,GroupLayout.PREFERRED_SIZE)
                    .addComponent(signUpButton,GroupLayout.PREFERRED_SIZE, 32,GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jPanel1.add(right);
        right.setBounds(380, 0, 420, 500);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }


    public void actionPerformed(ActionEvent event) {}


}