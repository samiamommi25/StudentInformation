package cse213.studentsp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        Student s = new Student("samia", 2521129,3.5F,
                LocalDate.of(2004,7,23),true);
        System.out.println(s);
    }
}
//public Student(String name, int id, float cgpa, LocalDate dateOfBirth, boolean hasScholarship)