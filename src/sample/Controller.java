package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private TextArea textArea;
    @FXML
    private TextField textField1;
    @FXML
    private TextField textField2;


    public void sum() {

        int c = Integer.parseInt(textField1.getText()) + Integer.parseInt(textField2.getText());
        textArea.appendText(String.valueOf(new Integer(c)));
    }

    public void diff() {

        int c = Integer.parseInt(textField1.getText()) - Integer.parseInt(textField2.getText());
        textArea.appendText(String.valueOf(new Integer(c)));
    }

    public void mult() {

        int c = Integer.parseInt(textField1.getText()) * Integer.parseInt(textField2.getText());
        textArea.appendText(String.valueOf(new Integer(c)));
    }

    public void division() {

        int c = Integer.parseInt(textField1.getText()) / Integer.parseInt(textField2.getText());
        textArea.appendText(String.valueOf(new Integer(c)));
    }

    public void clear() {

        textArea.clear();
    }
}
