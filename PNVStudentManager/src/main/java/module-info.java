module com.example.pnvstudentmanager {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.pnvstudentmanager to javafx.fxml;
    exports com.example.pnvstudentmanager;
}