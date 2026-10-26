package cse213.studentsp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("studentView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();


    }
    public void showAlert() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("error");
        alert.setContentText("your game has crashed");
        alert.showAndWait();
    }
    public void showAlert(String s) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confarmation");
        alert.setContentText(s);
        alert.showAndWait();
    }



}