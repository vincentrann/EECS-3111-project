package appUI;

import javax.swing.*;
import Models.Client;
import Models.Item;
import Models.SystemDatabase;
import Models.VirtualItem;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//TODO duration system
public class ViewCourseBook extends JPanel {
    private SystemDatabase database; //reference to database
    private Client client; //reference to client

    public ViewCourseBook() {
        this.database = database; //Initialize database reference
        this.client = client;
                
        display(findVTByEmail(client.getEmail()));
    }
    
    
    //Formatting from OpenVirtualBook
    public void display(String name) {
        Item item = database.getVirtualItem(name); 
        if (item != null) {
        	
        	JOptionPane.showMessageDialog(null, "Item Name: " + item.getName(), "Item Name", JOptionPane.INFORMATION_MESSAGE);
            
        	String content = ((VirtualItem) item).getContent();

        	JTextArea contentArea = new JTextArea(content);
        	contentArea.setEditable(false);

        	JScrollPane scrollPane = new JScrollPane(contentArea);
        	scrollPane.setPreferredSize(new Dimension(400, 300));

        	JOptionPane.showMessageDialog(null, scrollPane, "Virtual Item Content", JOptionPane.INFORMATION_MESSAGE);

            }
        else {
        	String message = "No virtual item found with name: " + name;
        	JOptionPane.showMessageDialog(null, message, "Item Not Found", JOptionPane.INFORMATION_MESSAGE);

        }
    }
    
    public String findVTByEmail(String targetEmail) {
        String csvFile = "StudentData.csv";
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");
                if (columns.length > 2 && columns[0].equals(targetEmail)) {
                    // If the first column matches the target email, return the value from the third column (virtualTextbook)
                    return columns[2];
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // If the email is not found or an error occurs, return null
        return null;
    }
    
    public String findVirtualTextbook(String targetName) {
        String csvFile = "VirtualItems.csv";
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");
                if (columns.length > 3 && columns[0].equals(targetName)) {
                    // If the first column matches the target name, return the value from the fourth column (text)
                    return columns[3];
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // If the name is not found or an error occurs, return null
        return null;
    }
}
