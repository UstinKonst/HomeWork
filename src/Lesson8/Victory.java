package Lesson8;

import javax.swing.*;
import java.awt.*;

public class Victory extends JFrame {
    private static final int WIN_HEIGHT = 200;
    private static final int WIN_WIDTH  = 200;
    private static final int WIN_POS_X  = 800;
    private static final int WIN_POS_Y  = 400;


    public Victory(String a) {
        setBounds(WIN_POS_X,WIN_POS_Y,WIN_WIDTH,WIN_HEIGHT);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Игра окончена");
        setResizable(false);

        JTextField textField = new JTextField(a);
        add(textField, BorderLayout.CENTER);
        JButton btnExit = new JButton("Exit");
        add(btnExit, BorderLayout.SOUTH);
        btnExit.addActionListener(e -> {
            System.exit(0);
        });



        setVisible(true);
    }

}
