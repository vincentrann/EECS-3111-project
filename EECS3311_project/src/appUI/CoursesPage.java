package appUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.opencsv.exceptions.CsvValidationException;

import Models.Client;
import Models.SystemDatabase;

public class CoursesPage extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JPanel mainPanel;
    private ArrayList<String> courses;

    public CoursesPage(ArrayList<String> courses, String email) {
        this.courses = courses;

        setTitle("Courses Page");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        add(mainPanel);

        displayCourses(email);
        
        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement action for adding a new course
                String newCourse = JOptionPane.showInputDialog("Enter course name:");
                if (newCourse != null && !newCourse.isEmpty()) {
                    SystemDatabase.getInstance().addCourse(newCourse, email);
                    courses.add(newCourse);
                    displayCourses(email);
                }
            }
        });
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(addButton);
        add(buttonPanel, BorderLayout.NORTH);


        setVisible(true);
    }

    private void displayCourses(String email) {
        mainPanel.removeAll(); // Clear existing components

        for (String course : courses) {
            JPanel coursePanel = new JPanel();
            coursePanel.setLayout(new FlowLayout(FlowLayout.LEFT));

            JLabel nameLabel = new JLabel(course);
            JButton deleteButton = new JButton("Delete");

            deleteButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Remove the course from the list and update the display
                    courses.remove(course);
                    try {
						SystemDatabase.getInstance().removeCourse(course, email);
					} catch (CsvValidationException e1) {
						e1.printStackTrace();
					}
                    displayCourses(email);
                }
            });

            coursePanel.add(nameLabel);
            coursePanel.add(deleteButton);
            mainPanel.add(coursePanel);
        }

        revalidate();
        repaint();
    }

}
