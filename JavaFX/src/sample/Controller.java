package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML private TextField firstName;

    public void handleSayHello(ActionEvent actionEvent) {
        System.out.printf("Hello %s! %n", firstName.getText());
    }
}
