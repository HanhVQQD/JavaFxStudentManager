package com.example.pnvstudentmanager;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        DBConnect connection = new DBConnect();
        List<Students> students = connection.getStudent();
        System.out.println("Size: " + students.size());

        //connection.insertStudent(new Students ("HV",9.0f));
        //connection.UpdateStudent(new Students(1,"Hanh n", 9.0f));
        connection.DeleteStudent(1);
    }

    public static void main(String[] args) {
        launch();
    }
}