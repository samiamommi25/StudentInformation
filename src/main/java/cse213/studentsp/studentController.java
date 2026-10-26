package cse213.studentsp;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

//import static jdk.internal.org.jline.utils.Colors.s;

public class studentController
{
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private TextField cgpaTF;
    @javafx.fxml.FXML
    private DatePicker dobDate;
    @javafx.fxml.FXML
    private TextField idTF;
    @javafx.fxml.FXML
    private CheckBox scholarshipCkB;
    ArrayList<Student> studentList = new ArrayList<>();
    @javafx.fxml.FXML
    private TableColumn<String,Student> nameTC;
    @javafx.fxml.FXML
    private TableView<Student> tableView;
    @javafx.fxml.FXML
    private TableColumn<Integer,Student> idTC;
    @javafx.fxml.FXML
    private TableColumn<Float,Student> cgpaTC;

    @javafx.fxml.FXML
    public void initialize() {
        idTC.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameTC.setCellValueFactory(new PropertyValueFactory<>("name"));
        cgpaTC.setCellValueFactory(new PropertyValueFactory<>("cgpa"));


    }

    @javafx.fxml.FXML
    public void studentInformationButton(ActionEvent actionEvent) {
        String name = nameTF.getText();
        int id = Integer.parseInt(idTF.getText());
        float cgpa = Float.parseFloat(cgpaTF.getText());
        LocalDate dob = dobDate.getValue();
        boolean hasScholarship = scholarshipCkB.isSelected();
        Alert a = new Alert(Alert.AlertType.ERROR);

        if (cgpa >4 ) {
            a.setContentText("CGPA can't be greater than 4 ");
            a.showAndWait();
            return;
        }
        if(cgpa <=0 ){
            a.setContentText("CGPA can't be negative");
            a.showAndWait();
            return;

        }
        if(cgpa < 3.7 && scholarshipCkB.isSelected() ){
            a.setContentText("Scholarship is not allowed less than 3.7");
            a.showAndWait();
            return;
        }
        if(cgpa >= 3.7 && !scholarshipCkB.isSelected()){
            a.setContentText("Scholarship must avaiable from CG 3.7");
            a.showAndWait();
            return;
        }
        Student student = new Student(name, id, cgpa, dob, hasScholarship);
        studentList.add(student);

        System.out.println(student);

    }

    @javafx.fxml.FXML
    public void showstudentButton(ActionEvent actionEvent) {
        for (Student student : studentList) {
            if(student.getCgpa()>= 3.5){
                tableView.getItems().add(student);
            }
        }
    }
}