module com.mycompany.prueba {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.prueba to javafx.fxml;
    exports com.mycompany.prueba;
}