import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FuturisticBrowser extends JFrame {
    private JTextField addressBar;
    private JEditorPane display;

    // Constructor
    public FuturisticBrowser() {
        super("Futuristic Browser");

        // Set up the address bar
        addressBar = new JTextField("Enter URL Here");
        addressBar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                loadPage(event.getActionCommand());
            }
        });
        add(addressBar, BorderLayout.NORTH);

        // Set up the display pane
        display = new JEditorPane();
        display.setEditable(false);
        display.addHyperlinkListener(new HyperlinkListener() {
            public void hyperlinkUpdate(HyperlinkEvent event) {
                if (event.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    loadPage(event.getURL().toString());
                }
            }
        });
        JScrollPane scrollPane = new JScrollPane(display);
        add(scrollPane, BorderLayout.CENTER);

        // Set up the window
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Load the specified URL into the display pane
    private void loadPage(String url) {
        try {
            display.setPage(url);
            addressBar.setText(url);
        } catch (Exception e) {
            System.err.println("Failed to load page: " + e);
        }
    }

    // Main method
    public static void main(String[] args) {
        FuturisticBrowser browser = new FuturisticBrowser();
    }
}
