package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    // Create resources route for all non java files. Right click it and click Mark Directory As Resources route

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/sample.fxml"));   //getResource finds a non java file. // Starts at resources folder since it was marked as the resource route

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    private Group manuallyCreatingNodes() { // without using fxml
        Group root = new Group();
        Text txt = new Text("Hello");
        txt.setFont(new Font("Papyrus", 80));
        Label label = new Label("Name:");

        TextField nameFld = new TextField();

        Button btn = new Button();
        btn.setText("Say Hi");

        GridPane grid = new GridPane();
        grid.add(label, 0, 0);
        grid.add(nameFld, 1, 0);
        grid.add(btn, 1, 1);

        grid.setHgap(20);

        //grid.setGridLinesVisible(true); // debugging feature that shows grid lines

        // Event handler for button
        btn.setOnAction(evt -> System.out.printf("Hi %s%n",
                nameFld.getText()));

//        root.getChildren().add(txt);
//        root.getChildren().add(btn);

        txt.setY(50);
        VBox box = new VBox();  // Adding a vertical box to stack the txt and buttons together
        box.getChildren().addAll(txt, grid);
        root.getChildren().add(box);
        return root;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
