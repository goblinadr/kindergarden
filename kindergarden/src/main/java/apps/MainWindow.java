package apps;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class MainWindow extends JFrame {

    private ResourceBundle bundle;
    private JPanel contentPane;
    
    enum ControlName {
        GROUP_NAME("Group"),
        
        CREATE_A_GROUP("Create a group");
        
        
        
        private String defValue;
        private ControlName(String defValue){
            this.defValue = defValue;
        }
    }
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainWindow frame = new MainWindow();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public MainWindow() {
        bundle = ResourceBundle.getBundle("lang."+this.getClass().getName());
       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        JMenu mnGroups = new JMenu(getControlTextName(ControlName.GROUP_NAME));
        menuBar.add(mnGroups);
        
        JMenuItem mntmCreateAGroup = new JMenuItem(getControlTextName(ControlName.CREATE_A_GROUP));
        mnGroups.add(mntmCreateAGroup);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
    }
    
    private String getControlTextName(ControlName elem){
        try{
           return bundle.getString(elem.name());
        }catch(MissingResourceException e) {
            return elem.defValue;
        }
    }

}
