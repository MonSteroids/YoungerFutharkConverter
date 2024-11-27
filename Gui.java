import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {
    public Gui() {
        // Create the main frame
        JFrame frame = new JFrame();

        // Set application icon
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("icon/b&w-notext-transparent.png"));

        // Create components
        JButton button = new JButton("Convert");
        JLabel label = new JLabel("Enter text to convert:");
        JTextField textField = new JTextField(20); // Input field for user text
        JTextField resultField = new JTextField(); // Field to display the converted text
        resultField.setEditable(false); // Prevent editing
        resultField.setFont(new Font("Arial", Font.BOLD, 16)); // Increase font size for result
        resultField.setPreferredSize(new Dimension(400, 30)); // Fixed size for result field

        // Fix sizes for textField and button
        textField.setPreferredSize(new Dimension(400, 30));
        button.setPreferredSize(new Dimension(100, 30));

        // Create and configure the panel
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Padding around components
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.fill = GridBagConstraints.NONE; // Prevent stretching
        panel.add(label, gbc);

        // Add a sub-panel for the textField with a fixed size
        JPanel textFieldPanel = new JPanel();
        textFieldPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        textFieldPanel.add(textField);
        gbc.gridy = 1;
        panel.add(textFieldPanel, gbc);

        // Add a sub-panel for the button with a fixed size
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(button);
        gbc.gridy = 2;
        panel.add(buttonPanel, gbc);

        // Add resultField for displaying converted text
        gbc.gridy = 3;
        panel.add(resultField, gbc);

        // Add functionality to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = textField.getText();
                String convertedText = YoungFutharkConvert.convertToYoungerFuthark(inputText);
                resultField.setText(convertedText); // Update the resultField
            }
        });

        // Make the button respond to Enter
        frame.getRootPane().setDefaultButton(button);

        // Configure the frame
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Young Futhark Converter");
        frame.pack(); // Adjusts size based on panel's preferred size
        frame.setVisible(true);
    }
}

