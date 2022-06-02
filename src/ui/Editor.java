package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Editor extends JFrame {
    private JPanel mainPanel;
    private JButton parseButton;
    private JScrollPane editorPane;
    private JScrollPane outputPane;
    private JButton translateButton;
    private JTextArea editor;
    private JTextPane output;
    private JLabel editorLbl;
    private JLabel outputLbl;

    public Editor(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        parseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Grab text from the editor textfield.
                String editorText = editor.getText();
                System.out.println("TEXT: " + editorText );
                editor.setText("");
            }
        });
    }

    public void setOutputText(String outputTest){
        this.output.setText(outputTest);
    }

}
