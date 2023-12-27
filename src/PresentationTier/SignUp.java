
package PresentationTier;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp extends JFrame implements ActionListener{

    private JLabel email,name,password,signUp,uptLogo;
    private JTextField emailField,nameField;
    private JButton logInButton,signUpButton;
    private JPanel left,right;
    private JPasswordField passwordField;
    public SignUp() {
        initComponents();
    }

    private void initComponents() {

        right = new JPanel();
        left = new JPanel();
        uptLogo = new JLabel();
        signUp = new JLabel();
        name = new JLabel();
        nameField = new JTextField();
        email = new JLabel();
        emailField = new JTextField();
        password = new JLabel();
        passwordField = new JPasswordField();
        signUpButton = new JButton();
        logInButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        right.setBackground(new Color(255, 255, 255));
        right.setPreferredSize(new Dimension(800, 500));

        left.setBackground(new Color(0, 102, 102));
        left.setForeground(new Color(255, 255, 255));

        uptLogo.setIcon(new ImageIcon("Images/logo.jpg")); 

        GroupLayout leftLayout = new GroupLayout(left);
        left.setLayout(leftLayout);
        leftLayout.setHorizontalGroup(
            leftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(leftLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(uptLogo, GroupLayout.PREFERRED_SIZE, 270,GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        leftLayout.setVerticalGroup(
            leftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(leftLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(uptLogo)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        signUp.setFont(new Font("Segoe UI", 1, 36));
        signUp.setForeground(new Color(0, 102, 102));
        signUp.setText("Sign Up");

        name.setFont(new Font("Segoe UI", 0, 16));
        name.setText("Name");

       
        email.setFont(new Font("Segoe UI", 0, 16));
        email.setText("Email");

        password.setFont(new Font("Segoe UI", 0, 16));
        password.setText("Password");


        signUpButton.setBackground(new Color(0, 102, 102));
        signUpButton.setFont(new Font("Segoe UI", 0, 14));
        signUpButton.setForeground(new Color(255, 255, 255));
        signUpButton.setText("Sign Up");
        signUpButton.addActionListener(this);
        logInButton.setBackground(new Color(0, 102, 102));
        logInButton.setFont(new Font("Segoe UI", 0, 14));
        logInButton.setForeground(new Color(255, 255, 255));
        logInButton.setText("Log In");
        logInButton.addActionListener(this);

        GroupLayout rightLayout = new GroupLayout(right);
        right.setLayout(rightLayout);
        rightLayout.setHorizontalGroup(
            rightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(rightLayout.createSequentialGroup()
                .addComponent(left,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
                .addGroup(rightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(rightLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(signUp))
                    .addGroup(rightLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(rightLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(name)
                            .addComponent(email)
                            .addComponent(password)
                            .addComponent(nameField)
                            .addComponent(emailField)
                            .addComponent(passwordField,GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                            .addGroup(rightLayout.createSequentialGroup()
                                .addComponent(signUpButton,GroupLayout.PREFERRED_SIZE, 85,GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(logInButton,GroupLayout.PREFERRED_SIZE, 84,GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        rightLayout.setVerticalGroup(
            rightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(rightLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(signUp,GroupLayout.PREFERRED_SIZE, 47,GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(name)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameField, GroupLayout.PREFERRED_SIZE, 32,GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(email)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailField, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(password)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordField,GroupLayout.PREFERRED_SIZE, 32,GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(rightLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(signUpButton,GroupLayout.PREFERRED_SIZE, 35,GroupLayout.PREFERRED_SIZE)
                    .addComponent(logInButton,GroupLayout.PREFERRED_SIZE, 35,GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
            .addComponent(left,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(right,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(right,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }
    public void actionPerformed(ActionEvent event){}


//    private void signUpButtonActionPerformed(ActionEvent evt) {
//
//    }
//
//    private void jButton1ActionPerformed(ActionEvent evt) {
//        LogIn LoginFrame =new LogIn();
//        LoginFrame.setVisible(true);
//        LoginFrame.pack();
//        LoginFrame.setLocationRelativeTo(null);
//    }
//
}

