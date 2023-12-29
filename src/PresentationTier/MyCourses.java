
package PresentationTier;

import Resources.Course;
import Resources.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyCourses extends JFrame {
    private JLabel availableCoursesLabel;
    private JLabel availableCoursesLogo;
    private JPanel availableCoursesPanel;
    private JLabel homeLabel;
    private JLabel homeLogo;
    private JPanel homePanel;
    private JLabel titleLabel;
    private JScrollPane jScrollPane1;
    private JLabel logOUtLogo;
    private JLabel logOutLabel;
    private JPanel logOutPanel;
    private JLabel logo;
    private JPanel mainBoard;
    private JPanel myCoursePanel;
    private JLabel myCoursesLabel;
    private JLabel myCoursesLogo;
    private JPanel panel;
    private JLabel profileLabel;
    private JLabel profileLogo;
    private JPanel profilePanel;
    private JPanel sideMenu;
    private DefaultListModel<Course> courseListModel;
    private JList<Course> myCoursesList;
    private Student loggedStudent;
    
    public MyCourses(Student student) {
        loggedStudent = student;
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
        jScrollPane1 = new JScrollPane();
        titleLabel = new JLabel();
        courseListModel = new DefaultListModel<>();
        myCoursesList = new JList<>(courseListModel);


        myCoursesList.setModel(courseListModel);
        // TODO: set startingHour and finishHour as Time objects
        courseListModel.addElement(new Course("CyberSecurity", "John Doe", 42,"09:00" , "11:00", "Monday", 1, 4.0, 201));
        courseListModel.addElement(new Course("Computer Networks", "John Doe", 42,"09:00" , "11:00", "Monday", 1, 4.0, 201));
        courseListModel.addElement(new Course("Operating Systems", "John Doe", 42,"09:00" , "11:00", "Monday", 1, 4.0, 201));

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

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

        profilePanel.setBackground(new Color(0, 102, 102));
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

        myCoursePanel.setBackground(new Color(93, 131, 148));
        myCoursePanel.setForeground(new Color(255, 255, 255));
        myCoursePanel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                myCoursePanelMouseClicked(evt);
            }
        });

        myCoursesLogo.setHorizontalAlignment(SwingConstants.CENTER);
        myCoursesLogo.setIcon(new ImageIcon("Images/MyCourses.png"));

        myCoursesLabel.setFont(new Font("Segoe UI Semibold", 0, 14));
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
        logOutPanel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                logOutPanelMouseClicked(evt);
            }
        });
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
                                .addGap(508, 508, 508))
        );

        panel.add(sideMenu);
        sideMenu.setBounds(0, 0, 270, 610);

        mainBoard.setBackground(new Color(255, 255, 255));
        mainBoard.setPreferredSize(new Dimension(800, 650));


        myCoursesList.setForeground(new Color(93, 131, 148));
        myCoursesList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        myCoursesList.setVisibleRowCount(15);
        jScrollPane1.setViewportView(myCoursesList);
        myCoursesList.getAccessibleContext().setAccessibleName("");
        myCoursesList.getAccessibleContext().setAccessibleDescription("");

        titleLabel.setBackground(new Color(255, 255, 255));
        titleLabel.setFont(new Font("Segoe UI Semibold", 1, 14));
        titleLabel.setForeground(new Color(93, 131, 148));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setText("My Courses");

        GroupLayout mainBoardLayout = new GroupLayout(mainBoard);
        mainBoard.setLayout(mainBoardLayout);
        mainBoardLayout.setHorizontalGroup(
                mainBoardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(mainBoardLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(mainBoardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(titleLabel, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 588, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(157, Short.MAX_VALUE))
        );
        mainBoardLayout.setVerticalGroup(
                mainBoardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, mainBoardLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(titleLabel, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 506, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(55, Short.MAX_VALUE))
        );

        panel.add(mainBoard);
        mainBoard.setBounds(270, 0, 780, 650);

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
        Home homeFrame = new Home(loggedStudent);
        homeFrame.setVisible(true);
        homeFrame.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    private void profilePanelMouseClicked(MouseEvent evt) {
        Profile profileFrame = new Profile(loggedStudent);
        profileFrame.setVisible(true);
        profileFrame.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    private void myCoursePanelMouseClicked(MouseEvent evt) {
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