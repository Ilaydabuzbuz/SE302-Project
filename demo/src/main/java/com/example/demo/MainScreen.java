package com.example.demo;


import javafx.application.Application;
import javafx.application.HostServices;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class MainScreen extends Application {
    private static HostServices hostServices;

    static ArrayList<Course> courseList = new ArrayList<>();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        courseList = CourseDataAccessObject.getCourses();
        ArrayList<Classroom> classroomsList = ClassroomDataAccessObject.getClassrooms();
        for (Course course : courseList) {
            //System.out.println(course.getCourseID() + " " + course.getEnrolledStudentsList().size());
            System.out.println(course + " " + course.getCourseID() + " " + AttendenceDatabase.studentsOfSpecificCourse(course).size());
            course.assignClassroom(classroomsList);
            System.out.println(course.getAssignedClassroom().getClassroomName());
        }

        //TODO
        ArrayList<Course> studentCourses = CourseDataAccessObject.getCoursesBasedOnStudent("DOĞA GÜNEŞ");
        /*
        for(Course crs : studentCourses) {
            System.out.println(crs + " " + crs.getCourseID());
        }

         */
        hostServices = getHostServices();
        FXMLLoader fxmlLoader = new FXMLLoader(MainScreen.class.getResource("MainScreen.fxml"));
        //FXMLLoader fxmlLoader = new FXMLLoader(MainScreen.class.getResource("Students.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 900, 750);

        primaryStage.setMinWidth(400); // Minimum genişlik
        primaryStage.setMinHeight(400); // Minimum yükseklik

        primaryStage.setTitle("Syllabus Application");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static HostServices getHostServicesInstance() {
        return hostServices; // Controller sınıfı buradan erişebilir
    }
}
