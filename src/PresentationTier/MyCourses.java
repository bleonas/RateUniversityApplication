
package PresentationTier;

import LogicLayer.ProcessData;
import LogicLayer.UserAuthentication;
import Resources.Course;
import Resources.Feedback;
import Resources.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;



public class MyCourses extends JFrame {

    private JLabel availableCoursesLabel;
    private JLabel availableCoursesLogo;
    private JPanel availableCoursesPanel;
    private JLabel homeLabel;
    private JLabel homeLogo;
    private JPanel homePanel;
    private JLabel titleLabel;
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
    private JPanel courseDetails;
    private JLabel courseHours;
    private JLabel courseLecturer;
    private JComboBox<String> courseList;
    private JLabel courseName;
    private JPanel courseSelector;
    private JButton dropButton;
    private JPanel courseFeedbacks;
    private JList<Feedback> feedbacksList;
    private JScrollPane feedbacksPanel;
    private JLabel feedbacksTitle;
    private JButton leaveFeedbackButton;
    private ArrayList<Course> registeredCourses;
    private Student loggedStudent;
    private ProcessData processor = new UserAuthentication();
    private DefaultListModel<Feedback> feedbackModel;
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
        titleLabel = new JLabel();
        courseSelector = new JPanel();
        courseList = new JComboBox<>();
        courseDetails = new JPanel();
        courseName = new JLabel();
        courseLecturer = new JLabel();
        courseHours = new JLabel();
        dropButton = new JButton();
        courseFeedbacks = new JPanel();
        feedbacksTitle = new JLabel();
        feedbacksPanel = new JScrollPane();
        feedbacksList = new JList<>();
        leaveFeedbackButton = new JButton();
        registeredCourses = (ArrayList<Course>) loggedStudent.getCoursesJoined();

        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Course myCourse : registeredCourses) {
            model.addElement(myCourse.getCourseName());
        }
        courseList = new JComboBox<>(model);
        courseList.setSelectedItem(null);

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

        titleLabel.setBackground(new Color(255, 255, 255));
        titleLabel.setFont(new Font("Segoe UI Semibold", 1, 14));
        titleLabel.setForeground(new Color(93, 131, 148));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setText("My Courses");

        courseSelector.setBackground(new Color(255, 255, 255));

        courseList.setToolTipText("Select one of the courses to see further information");
        courseList.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                courseListActionPerformed(evt);
            }
        });


        GroupLayout courseSelectorLayout = new GroupLayout(courseSelector);
        courseSelector.setLayout(courseSelectorLayout);
        courseSelectorLayout.setHorizontalGroup(
                courseSelectorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(courseSelectorLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(courseList, GroupLayout.PREFERRED_SIZE, 542, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(60, Short.MAX_VALUE))
        );
        courseSelectorLayout.setVerticalGroup(
                courseSelectorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(courseSelectorLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(courseList, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        courseDetails.setBackground(new Color(255, 255, 255));
        courseDetails.setAutoscrolls(true);
        courseDetails.setName("");

        courseName.setFont(new Font("Segoe UI Semibold", 1, 14));
        courseName.setForeground(new Color(93, 131, 148));

        courseLecturer.setFont(new Font("Segoe UI Semibold", 1, 14));
        courseLecturer.setForeground(new Color(93, 131, 148));

        courseHours.setFont(new Font("Segoe UI Semibold", 1, 14));
        courseHours.setForeground(new Color(93, 131, 148));

        dropButton.setBackground(new Color(0, 153, 153));
        dropButton.setFont(new Font("Segoe UI Semibold", 1, 12));
        dropButton.setForeground(new Color(255, 255, 255));
        dropButton.setText("Drop Course");
        dropButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                dropButtonActionPerformed(evt);
            }
        });

        GroupLayout courseDetailsLayout = new GroupLayout(courseDetails);
        courseDetails.setLayout(courseDetailsLayout);
        courseDetailsLayout.setHorizontalGroup(
                courseDetailsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(courseDetailsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(courseDetailsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(courseDetailsLayout.createSequentialGroup()
                                                .addComponent(courseName, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(dropButton)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(courseDetailsLayout.createSequentialGroup()
                                                .addGroup(courseDetailsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(courseLecturer, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(courseDetailsLayout.createSequentialGroup()
                                                                .addComponent(courseHours, GroupLayout.PREFERRED_SIZE, 561, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 11, Short.MAX_VALUE)))
                                                .addContainerGap())))
        );
        courseDetailsLayout.setVerticalGroup(
                courseDetailsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(courseDetailsLayout.createSequentialGroup()
                                .addGroup(courseDetailsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(courseName, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dropButton))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(courseLecturer, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(courseHours, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        courseFeedbacks.setBackground(new Color(255, 255, 255));

        feedbacksTitle.setFont(new Font("Segoe UI Semibold", 1, 14));
        feedbacksTitle.setForeground(new Color(93, 131, 148));
        feedbacksTitle.setText("Course Feedbacks");

        feedbacksList.setFont(new Font("Segoe UI Semibold", 1, 14));
        feedbacksList.setForeground(new Color(93, 131, 148));

        //TODO Set feedbacksList Model
        /*feedbacksList.setModel(new AbstractListModel<String>() {
            String[] strings = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

            public int getSize() {return strings.length;}

            public String getElementAt(int i) {return strings[i];}
        });*/

        feedbacksList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        feedbacksList.setToolTipText("");
        feedbacksList.setSelectionBackground(new Color(0, 102, 102));
        feedbacksPanel.setViewportView(feedbacksList);

        leaveFeedbackButton.setBackground(new Color(0, 153, 153));
        leaveFeedbackButton.setFont(new Font("Segoe UI Semibold", 1, 12));
        leaveFeedbackButton.setForeground(new Color(255, 255, 255));
        leaveFeedbackButton.setText("Leave Feedback");
        leaveFeedbackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leaveFeedbackButtonActionPerformed(evt);
            }
        });

        GroupLayout courseFeedbacksLayout = new GroupLayout(courseFeedbacks);
        courseFeedbacks.setLayout(courseFeedbacksLayout);
        courseFeedbacksLayout.setHorizontalGroup(
                courseFeedbacksLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(courseFeedbacksLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(courseFeedbacksLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(feedbacksPanel, GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                                        .addGroup(courseFeedbacksLayout.createSequentialGroup()
                                                .addComponent(feedbacksTitle, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
                                                .addGap(48, 48, 48)
                                                .addComponent(leaveFeedbackButton, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        courseFeedbacksLayout.setVerticalGroup(
                courseFeedbacksLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(courseFeedbacksLayout.createSequentialGroup()
                                .addGroup(courseFeedbacksLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(feedbacksTitle, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(leaveFeedbackButton, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(feedbacksPanel, GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                                .addContainerGap())
        );


        GroupLayout mainBoardLayout = new GroupLayout(mainBoard);
        mainBoard.setLayout(mainBoardLayout);
        mainBoardLayout.setHorizontalGroup(
                mainBoardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(mainBoardLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(mainBoardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(courseFeedbacks, GroupLayout.PREFERRED_SIZE, 581, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(courseSelector, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(titleLabel, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(courseDetails, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(131, Short.MAX_VALUE))
        );
        mainBoardLayout.setVerticalGroup(
                mainBoardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, mainBoardLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titleLabel, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(courseSelector, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(courseDetails, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(courseFeedbacks, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(54, Short.MAX_VALUE))
        );

        panel.add(mainBoard);
        mainBoard.setBounds(270, 0, 780, 650);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panel, GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
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
        LogIn LoginFrame = new LogIn();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    private void dropButtonActionPerformed(ActionEvent evt) {
        String selectedCourseName = (String) courseList.getSelectedItem();

        if (selectedCourseName != null) {
            Course selectedCourse = null;
            for (Course course : registeredCourses) {
                if (course.getCourseName().equals(selectedCourseName)) {
                    selectedCourse = course;
                    break;
                }
            }

            if (selectedCourse != null) {
                processor.dropCourse(loggedStudent, selectedCourse);
                MyCourses updatedCoursesFrame = new MyCourses(loggedStudent);
                updatedCoursesFrame.setVisible(true);
                updatedCoursesFrame.pack();
                updatedCoursesFrame.setLocationRelativeTo(null);
                dispose();
            }
        }
    }

    private void courseListActionPerformed(ActionEvent evt) {
        String selectedCourse = (String) courseList.getSelectedItem();
        if (selectedCourse != null) {
            for (Course course : registeredCourses) {
                if (course.getCourseName().equals(selectedCourse)) {
                    updateCourseDetails(course);
                    break;
                }
            }
            feedbackModel = new DefaultListModel<>();
            ArrayList<Feedback> feedbacksForCourse = (ArrayList<Feedback>) processor.getFeedbacksForCourse(selectedCourse);
            for(Feedback feedback:feedbacksForCourse){
                feedbackModel.addElement(feedback);
            }
            feedbacksList.setModel(feedbackModel);

        }
    }

    public void updateCourseDetails(Course selectedCourse) {
        courseName.setText(selectedCourse.getCourseName() + "   " + selectedCourse.getRating());
        courseLecturer.setText("Lecturer: " + selectedCourse.getLecturer() + "     Number of Students: " + selectedCourse.getNumberOfStudents());
        courseHours.setText("Lecture Time and Hall: " + selectedCourse.getDayOftheWeek() + " - "
                + selectedCourse.getStartingHour() + " : "
                + selectedCourse.getFinishHour() + " - Hall "
                + selectedCourse.getLectureHall() + " - Semester "
                + selectedCourse.getSemester());
        //TODO add code to update feedbacks according to the selected course
    }

    private void leaveFeedbackButtonActionPerformed(ActionEvent evt) {
        showFeedbackDialog();
    }

    private void showFeedbackDialog() {
        JDialog dialog = new JDialog();
        JPanel dialogPanel = new JPanel();
        JButton submitButton = new JButton("Submit");

        dialogPanel.add(new JLabel("Feedback: "));
        JTextField dialogTextField = new JTextField(50);
        dialogPanel.add(dialogTextField);

        dialogPanel.add(new JLabel("Rating: "));
        JComboBox<Integer> dialogRatingComboBox = new JComboBox<>(new Integer[]{1, 2, 3, 4, 5});
        dialogRatingComboBox.setSelectedItem(null);
        dialogPanel.add(dialogRatingComboBox);
        dialogPanel.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String description = dialogTextField.getText();
                int rating = (int) dialogRatingComboBox.getSelectedItem();
                //Feedback myFeedback = new Feedback();
                //myFeedback.setCourseName();
                //myFeedback.setDescription(description);
                //myFeedback.setRating(rating);
                dialog.dispose();
            }
        });

        dialog.add(dialogPanel);
        dialog.setSize(600, 300);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }

}