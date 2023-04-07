module com.example.crudutilisateur {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.crudutilisateur to javafx.fxml;
    exports com.example.crudutilisateur;
}