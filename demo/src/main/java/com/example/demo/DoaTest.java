package com.example.demo;

import java.io.IOException;
import java.util.ArrayList;

public class DoaTest {
    public static void main(String[] args) throws IOException {
        CSV_Reader csv = new CSV_Reader();



        /*
        ClassroomDataAccessObject cdo = new ClassroomDataAccessObject();
        cdo.createTable();
        cdo.addClassroom(csv.readClassrooms());
        ArrayList<Classroom> arr = cdo.getClassrooms();
        for(int i = 0; i< arr.size(); i++){
            System.out.println(arr.get(i).getClassroomName() + arr.get(i).getCapacity() );
        }

         */
        //System.out.println(cdo.getCapacityWhereClassroomIs("C201"));


        /*
        CourseDataAccessObject courseDataAccessObject = new CourseDataAccessObject();
        courseDataAccessObject.createTable();
        courseDataAccessObject.addCourse(csv.readCourses());
        //courseDataAccessObject.getCourses();
        //courseDataAccessObject.getCourseWhereLecturerIs("Turhan Tunalı");
        ArrayList<Course> arr = courseDataAccessObject.getCourses();
        for(int i = 0; i< arr.size(); i++){
            //System.out.println(arr.get(i).getCourseID() + arr.get(i).getTimeToStart(), arr.get(i).getDuration(), arr.get(i).getLecturer(), arr.get(i).getStudentNames().toString());
        }

         */

        AttendenceDatabase ad = new AttendenceDatabase();
        ad.createTables();


    }
}
