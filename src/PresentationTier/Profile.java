package PresentationTier;

import LogicLayer.ProcessData;
import LogicLayer.UserAuthentication;
import Resources.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Profile extends JFrame{
    private JLabel availableCoursesLabel;
    private JLabel availableCoursesLogo;
    private JPanel availableCoursesPanel;
    private JLabel homeLabel;
    private JLabel homeLogo;
    private JPanel homePanel;
    private JLabel infoLabel;
    private JLabel profilePhotoLabel;
    private JLabel nameLabel;
    private JLabel surnameLabel;
    private JLabel emailLabel;
    private JLabel deegreLabel;
    private JLabel yearLabel;
    private JLayeredPane jLayeredPane1;
    private JLabel logOUtLogo;
    private JLabel logOutLabel;
    private JPanel logOutPanel;
    private JLabel logo;
    private JPanel mainBoard;
    private JPanel myCoursePanel;
    private JLabel myCoursesLabel;
    private JLabel myCoursesLogo;
    private JPanel panel;
    private JPanel profile;
    private JLabel profileLabel;
    private JLabel profileLogo;
    private JPanel profilePanel;
    private JPanel sideMenu;
    private Student loggedStudent;
    private ProcessData processor = new UserAuthentication();
    public Profile(Student student){
        loggedStudent = student;

        jLayeredPane1 = new JLayeredPane();
        panel = new JPanel();
        sideMenu = new JPanel();
        logo = new JLabel();
        homePanel = new JPanel();
        homeLogo = new JLabel();
        homeLabel = new JLabel();
        profilePanel = new JPanel();
        profileLogo = new JLabel();
        profileLabel = new JLabel();
        myCoursePanel = new JPanel();
        myCoursesLogo = new JLabel();
        myCoursesLabel = new JLabel();
        availableCoursesPanel = new JPanel();
        availableCoursesLogo = new JLabel();
        availableCoursesLabel = new JLabel();
        logOutPanel = new JPanel();
        logOUtLogo = new JLabel();
        logOutLabel = new JLabel();
        mainBoard = new JPanel();
        profile = new JPanel();
        infoLabel = new JLabel();
        profilePhotoLabel = new JLabel();
        nameLabel = new JLabel();
        surnameLabel = new JLabel();
        emailLabel = new JLabel();
        deegreLabel = new JLabel();
        yearLabel = new JLabel();

        GroupLayout jLayeredPane1Layout = new GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
                jLayeredPane1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
                jLayeredPane1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        panel.setPreferredSize(new Dimension(800, 500));
        panel.setLayout(null);

        sideMenu.setBackground(new Color(0, 102, 102));

        logo.setFont(new Font("Segoe UI Semibold", 0, 14));
        logo.setForeground(new Color(255, 255, 255));
        logo.setIcon(new ImageIcon("Images/logo.png"));
        logo.setText("Rate University Application");

        homePanel.setBackground(new Color(0, 102, 102));
        homePanel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                homePanelMouseClicked(evt);
            }
        });

        homeLogo.setHorizontalAlignment(SwingConstants.CENTER);
        homeLogo.setIcon(new ImageIcon("Images/Home.png"));

        homeLabel.setFont(new Font("Segoe UI Semibold", 0, 14));
        homeLabel.setForeground(new Color(255, 255, 255));
        homeLabel.setText("Home");

        GroupLayout homePanelLayout = new GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
                homePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(homePanelLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(homeLogo, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(homeLabel, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(44, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
                homePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(homePanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(GroupLayout.Alignment.LEADING, homePanelLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(homeLabel))
                                        .addComponent(homeLogo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(15, 15, 15))
        );

        profilePanel.setBackground(new Color(93, 131, 148));
        profilePanel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                profilePanelMouseClicked(evt);
            }
        });

        profileLogo.setHorizontalAlignment(SwingConstants.CENTER);
        profileLogo.setIcon(new ImageIcon("Images/Profile.png"));

        profileLabel.setFont(new Font("Segoe UI Semibold", 0, 14));
        profileLabel.setForeground(new Color(255, 255, 255));
        profileLabel.setText("Profile");

        GroupLayout profilePanelLayout = new GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
                profilePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(profilePanelLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(profileLogo, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(profileLabel, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(44, Short.MAX_VALUE))
        );
        profilePanelLayout.setVerticalGroup(
                profilePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, profilePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(profilePanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(GroupLayout.Alignment.LEADING, profilePanelLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(profileLabel))
                                        .addComponent(profileLogo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(15, 15, 15))
        );

        myCoursePanel.setBackground(new Color(0, 102, 102));
        myCoursePanel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                myCoursePanelMouseClicked(evt);
            }
        });

        myCoursesLogo.setHorizontalAlignment(SwingConstants.CENTER);
        myCoursesLogo.setIcon(new ImageIcon("Images/MyCourses.png"));

        myCoursesLabel.setFont(new Font("Segoe UI Semibold", 0, 14)); // NOI18N
        myCoursesLabel.setForeground(new Color(255, 255, 255));
        myCoursesLabel.setText("My Courses");

        GroupLayout myCoursePanelLayout = new GroupLayout(myCoursePanel);
        myCoursePanel.setLayout(myCoursePanelLayout);
        myCoursePanelLayout.setHorizontalGroup(
                myCoursePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(myCoursePanelLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(myCoursesLogo, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(myCoursesLabel, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(44, Short.MAX_VALUE))
        );
        myCoursePanelLayout.setVerticalGroup(
                myCoursePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, myCoursePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(myCoursePanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(GroupLayout.Alignment.LEADING, myCoursePanelLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(myCoursesLabel))
                                        .addComponent(myCoursesLogo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        availableCoursesPanel.setBackground(new Color(0, 102, 102));
        availableCoursesPanel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                availableCoursesPanelMouseClicked(evt);
            }
        });

        availableCoursesLogo.setHorizontalAlignment(SwingConstants.CENTER);
        availableCoursesLogo.setIcon(new ImageIcon("Images/AvailableCourses.png"));

        availableCoursesLabel.setFont(new Font("Segoe UI Semibold", 0, 14));
        availableCoursesLabel.setForeground(new Color(255, 255, 255));
        availableCoursesLabel.setText("Available Courses");

        GroupLayout availableCoursesPanelLayout = new GroupLayout(availableCoursesPanel);
        availableCoursesPanel.setLayout(availableCoursesPanelLayout);
        availableCoursesPanelLayout.setHorizontalGroup(
                availableCoursesPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(availableCoursesPanelLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(availableCoursesLogo, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(availableCoursesLabel, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                .addContainerGap())
        );
        availableCoursesPanelLayout.setVerticalGroup(
                availableCoursesPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, availableCoursesPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(availableCoursesPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(GroupLayout.Alignment.LEADING, availableCoursesPanelLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(availableCoursesLabel))
                                        .addComponent(availableCoursesLogo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(15, 15, 15))
        );

        logOutPanel.setBackground(new Color(0, 102, 102));

        logOUtLogo.setHorizontalAlignment(SwingConstants.CENTER);
        logOUtLogo.setIcon(new ImageIcon("Images/Logout.png"));

        logOutLabel.setFont(new Font("Segoe UI Semibold", 0, 14));
        logOutLabel.setForeground(new Color(255, 255, 255));
        logOutLabel.setText("Log Out");

        GroupLayout logOutPanelLayout = new GroupLayout(logOutPanel);
        logOutPanel.setLayout(logOutPanelLayout);
        logOutPanelLayout.setHorizontalGroup(
                logOutPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(logOutPanelLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(logOUtLogo, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logOutLabel, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(44, Short.MAX_VALUE))
        );
        logOutPanelLayout.setVerticalGroup(
                logOutPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, logOutPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(logOutPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(GroupLayout.Alignment.LEADING, logOutPanelLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(logOutLabel))
                                        .addComponent(logOUtLogo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(15, 15, 15))
        );

        GroupLayout sideMenuLayout = new GroupLayout(sideMenu);
        sideMenu.setLayout(sideMenuLayout);
        sideMenuLayout.setHorizontalGroup(
                sideMenuLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(sideMenuLayout.createSequentialGroup()
                                .addGroup(sideMenuLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, sideMenuLayout.createSequentialGroup()
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(myCoursePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(sideMenuLayout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(logo, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 8, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, sideMenuLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(sideMenuLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(profilePanel, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(homePanel, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(availableCoursesPanel, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(logOutPanel, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())
        );
        sideMenuLayout.setVerticalGroup(
                sideMenuLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(sideMenuLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(logo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(66, 66, 66)
                                .addComponent(homePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(profilePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(myCoursePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(availableCoursesPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logOutPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(181, 181, 181))
        );

        panel.add(sideMenu);
        sideMenu.setBounds(0, 0, 270, 600);

        mainBoard.setBackground(new Color(255, 255, 255));
        mainBoard.setPreferredSize(new Dimension(800, 650));

        profile.setBackground(new Color(255, 255, 255));
        profile.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 5, new Color(0, 102, 102)));

        infoLabel.setFont(new Font("Segoe UI Semibold", 1, 14));
        infoLabel.setForeground(new Color(93, 131, 148));
        infoLabel.setText("  My Personal Information");

        profilePhotoLabel.setFont(new Font("Segoe UI Semibold", 1, 14));
        profilePhotoLabel.setForeground(new Color(93, 131, 183));
        profilePhotoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        profilePhotoLabel.setIcon(new ImageIcon("Images/Student.png"));

        nameLabel.setFont(new Font("Segoe UI Semibold", 1, 14));
        nameLabel.setForeground(new Color(93, 131, 148));

        String[] names = loggedStudent.getfullName().split(" ");
        nameLabel.setText("  Name:     "+names[0]);

        surnameLabel.setFont(new Font("Segoe UI Semibold", 1, 14));
        surnameLabel.setForeground(new Color(93, 131, 148));
        surnameLabel.setText("  Surname:     "+names[1]);

        emailLabel.setFont(new Font("Segoe UI Semibold", 1, 14));
        emailLabel.setForeground(new Color(93, 131, 148));
        emailLabel.setText("  Email Address:     "+loggedStudent.getEmail());

        deegreLabel.setFont(new Font("Segoe UI Semibold", 1, 14));
        deegreLabel.setForeground(new Color(93, 131, 148));
        deegreLabel.setText("  Deegre:     Computer Science");

        yearLabel.setFont(new Font("Segoe UI Semibold", 1, 14));
        yearLabel.setForeground(new Color(93, 131, 148));
        yearLabel.setText("  Year Of Studies:   3");

        GroupLayout profileLayout = new GroupLayout(profile);
        profile.setLayout(profileLayout);
        profileLayout.setHorizontalGroup(
                profileLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(profileLayout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addGroup(profileLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(profilePhotoLabel, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(infoLabel, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nameLabel, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(surnameLabel, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailLabel, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deegreLabel, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(yearLabel, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(173, Short.MAX_VALUE))
        );
        profileLayout.setVerticalGroup(
                profileLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(profileLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(profilePhotoLabel, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(infoLabel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(nameLabel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(surnameLabel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(emailLabel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deegreLabel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(yearLabel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(88, Short.MAX_VALUE))
        );

        GroupLayout mainBoardLayout = new GroupLayout(mainBoard);
        mainBoard.setLayout(mainBoardLayout);
        mainBoardLayout.setHorizontalGroup(
                mainBoardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(mainBoardLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(profile, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        mainBoardLayout.setVerticalGroup(
                mainBoardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, mainBoardLayout.createSequentialGroup()
                                .addContainerGap(15, Short.MAX_VALUE)
                                .addComponent(profile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
        );

        panel.add(mainBoard);
        mainBoard.setBounds(270, 0, 630, 600);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(panel, GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(panel, GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                                .addGap(0, 0, 0))
        );

        pack();
    }

    private void homePanelMouseClicked(MouseEvent evt) {
        Home homeFrame = new Home(loggedStudent);
        homeFrame.setVisible(true);
        homeFrame.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    private void profilePanelMouseClicked(MouseEvent evt) {
    }

    private void myCoursePanelMouseClicked(MouseEvent evt) {
        MyCourses myCoursesFrame = new MyCourses(loggedStudent);
        myCoursesFrame.setVisible(true);
        myCoursesFrame.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    private void availableCoursesPanelMouseClicked(MouseEvent evt) {
        AvailableCourses availableCoursesFrame = new AvailableCourses(loggedStudent);
        availableCoursesFrame.setVisible(true);
        availableCoursesFrame.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    private void logOutPanelMouseClicked(MouseEvent evt) {
        LogIn LoginFrame =new LogIn();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.setVisible(false);
    }


}
