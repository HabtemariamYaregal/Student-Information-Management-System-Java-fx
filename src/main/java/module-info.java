module com.example.student_information_management_system {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.student_information_management_system to javafx.fxml;
    exports com.example.student_information_management_system;
}