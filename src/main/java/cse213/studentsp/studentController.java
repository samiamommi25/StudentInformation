package cse213.studentsp;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

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
    private Label outputLable;
    @javafx.fxml.FXML
    private CheckBox scholarshipCkB;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void studentInformationButton(ActionEvent actionEvent) {
        String name = nameTF.getText();
        int id = Integer.parseInt(idTF.getText());
        float cgpa = Float.parseFloat(cgpaTF.getText());
        LocalDate dob = dobDate.getValue();
        boolean hasScholarship = scholarshipCkB.isSelected();

        if (cgpa <=4 && cgpa <=0 ) {
            outputLable.setText("CG must be less than or equal to 4 ");
            return;
        }


        Student student = new Student(name, id, cgpa, dob, hasScholarship);

        outputLable.setText(student.toString());
        System.out.println(student);

    }
}