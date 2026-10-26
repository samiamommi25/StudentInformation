module cse213.studentsp {
    requires javafx.controls;
    requires javafx.fxml;


    opens cse213.studentsp to javafx.fxml;
    exports cse213.studentsp;
}