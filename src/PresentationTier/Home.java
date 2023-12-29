package PresentationTier;

import Resources.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame {
    private JLabel availableCoursesLabel;
    private JLabel availableCoursesLogo;
    private JPanel availableCoursesPanel;
    private JPanel homeBoard;
    private JLabel homeLabel;
    private JLabel homeLogo;
    private JPanel homePanel;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JSeparator jSeparator1;
    private JTextArea jTextArea1;
    private JTextArea jTextArea2;
    private JLabel logOUtLogo;
    private JLabel logOutLabel;
    private JPanel logOutPanel;
    private JLabel logo;
    private JPanel myCoursePanel;
    private JLabel myCoursesLabel;
    private JLabel myCoursesLogo;
    private JPanel panel;
    private JLabel profileLabel;
    private JLabel profileLogo;
    private JPanel profilePanel;
    private JPanel sideMenu;
    private Student loggedStudent;
    public Home(Student student) {
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
        jSeparator1 = new JSeparator();
        homeBoard = new JPanel();
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jScrollPane2 = new JScrollPane();
        jTextArea2 = new JTextArea();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        panel.setPreferredSize(new Dimension(800, 500));
        panel.setLayout(null);

        sideMenu.setBackground(new Color(0, 102, 102));

        logo.setFont(new Font("Segoe UI Semibold", 1, 18));
        logo.setForeground(new Color(255, 255, 255));
        logo.setHorizontalAlignment(SwingConstants.CENTER);

        logo.setIcon(new ImageIcon("Images/logo.png"));
        logo.setText(" Rate University");

        homePanel.setBackground(new Color(93, 131, 148));
        homePanel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                homePanelMouseClicked(evt);
            }
        });

        homeLogo.setHorizontalAlignment(SwingConstants.CENTER);
        homeLogo.setIcon(new ImageIcon("Images/Home.png"));

        homeLabel.setFont(new Font("Segoe UI Semibold", 0, 14)); // NOI18N
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

        profilePanel.setBackground(new Color(0, 102, 102));
        profilePanel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                profilePanelMouseClicked(evt);
            }
        });

        profileLogo.setHorizontalAlignment(SwingConstants.CENTER);
        profileLogo.setIcon(new ImageIcon("Images/Profile.png")); ;

        profileLabel.setFont(new Font("Segoe UI Semibold", 0, 14)); // NOI18N
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
        availableCoursesLogo.setIcon(new ImageIcon("AvailableCourses.png"));

        availableCoursesLabel.setFont(new Font("Segoe UI Semibold", 0, 14)); // NOI18N
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
        logOutPanel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                logOutPanelMouseClicked(evt);
            }
        });

        logOUtLogo.setHorizontalAlignment(SwingConstants.CENTER);
        logOUtLogo.setIcon(new ImageIcon("Images/Logout.png"));

        logOutLabel.setFont(new Font("Segoe UI Semibold", 0, 14)); // NOI18N
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
                                                .addContainerGap(24, Short.MAX_VALUE)
                                                .addComponent(myCoursePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, sideMenuLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(sideMenuLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jSeparator1, GroupLayout.Alignment.TRAILING)
                                                        .addComponent(profilePanel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(homePanel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(availableCoursesPanel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(logOutPanel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(logo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap())
        );
        sideMenuLayout.setVerticalGroup(
                sideMenuLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(sideMenuLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(logo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(homePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(profilePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(myCoursePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(availableCoursesPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logOutPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(508, 508, 508))
        );

        panel.add(sideMenu);
        sideMenu.setBounds(0, 0, 270, 610);

        homeBoard.setBackground(new Color(255, 255, 255));
        homeBoard.setPreferredSize(new Dimension(800, 650));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jTextArea1.setForeground(new Color(93, 131, 148));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("\n\"Welcome to University Rate App! \nYour gateway to a seamless academic experience.\n Explore courses, track your progress, and stay updated with campus news and events.\"");
        jTextArea1.setToolTipText("");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setBorder(null);
        jTextArea1.setMargin(new Insets(0, 0, 0, 0));
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jTextArea2.setForeground(new Color(93, 131, 148));
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("\nUpcoming Events:\nWelcome Week - Aug 30 to Sep 3\nCareer Fair - Sep 15\nGuest Lecture Series - Oct 5 to Oct 7\"\n\nLatest Announcements:\nNew Scholarship Opportunities\nChanges to Fall Semester Schedule\nCampus Safety Measures Update\n\nAcademic Progress:\nOverall GPA: 3.8\nCurrent Semester: In Progress\n\nNews Feed:\n[University Name] Named Top University in [Category]\nCampus Sustainability Initiatives Recognized\nStudent Achievements: Congratulations to [Student Name]");
        jTextArea2.setToolTipText("");
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setAutoscrolls(false);
        jTextArea2.setBorder(null);
        jTextArea2.setMargin(new Insets(0, 0, 0, 0));
        jScrollPane2.setViewportView(jTextArea2);

        GroupLayout homeBoardLayout = new GroupLayout(homeBoard);
        homeBoard.setLayout(homeBoardLayout);
        homeBoardLayout.setHorizontalGroup(
                homeBoardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(homeBoardLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(homeBoardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2))
                                .addContainerGap())
        );
        homeBoardLayout.setVerticalGroup(
                homeBoardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(homeBoardLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 406, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(25, Short.MAX_VALUE))
        );

        panel.add(homeBoard);
        homeBoard.setBounds(270, 0, 640, 610);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panel, GroupLayout.DEFAULT_SIZE, 908, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panel, GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
        );

        pack();
    }

    private void homePanelMouseClicked(MouseEvent evt) {
    }

    private void profilePanelMouseClicked(MouseEvent evt) {
        Profile profileFrame = new Profile(loggedStudent);
        profileFrame.setVisible(true);
        profileFrame.setLocationRelativeTo(null);
        this.setVisible(false);
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
