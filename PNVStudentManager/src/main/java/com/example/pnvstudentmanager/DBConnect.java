package com.example.pnvstudentmanager;

        import javafx.event.ActionEvent;

        import javax.xml.transform.Result;
        import java.sql.*;
        import java.util.ArrayList;
        import  java.util.List;


public class DBConnect {
    private Connection connection;

    public DBConnect(){
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/PNVStudentManager",
                    "root",
                    "");
            System.out.println("Thanh cong n");
        } catch (SQLException e) {
            connection = null;
            System.out.println(e);
        }
    }

    List<Students> getStudent() {
        ArrayList<Students> students = new ArrayList<>();
        try {
            ResultSet result = connection.prepareStatement("SELECT * FROM students").executeQuery();
            while (result.next()) {
                int id = result.getInt("id");
                String name = result.getString("Name");
                float score = result.getFloat("Score");
                System.out.println("----------------");
                System.out.println(id);
                System.out.println(name);
                System.out.println(score);

                students.add(new Students( id, name, score));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return students;
    }
    void insertStudent (Students student) {
        String sql = "INSERT INTO students(name, score) VALUES (' "+ student.name + " '," + student.score + ")";
        System.out.println(sql);
        try {
            connection.prepareStatement(sql).executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    void UpdateStudent (Students student) {
        String sql = "UPDATE students SET name= '"+student.name+"', score="+student.score + " WHERE id = "+student.id;
            try {
                connection.prepareStatement(sql).executeUpdate();
            }catch (SQLException e) {
                throw new RuntimeException(e);
            }
    }

    void  DeleteStudent (int id) {
        String sql ="DELETE FROM students WHERE id=" +id+"";
        try {
            connection.prepareStatement(sql).executeUpdate();
            }catch (SQLException e) {
                throw  new RuntimeException(e);
            }
    }

}
