package sample.Logic;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.*;

public class Datasource {
    public static final String DB_name = "javabaza1.db" ;
    private static final String CONNECTION_STRING = "jdbc:sqlite:/Users/janmarchel/Desktop/baza/baza.db" ;
    public static final String TABLE_STUDENT = "student" ;
    public static final String TABLE_MATERIALS = "materialy" ;
    public static final String TABLE_UNIVERSITY = "uczelnia" ;
    public static final String TABLE_FACULTY = "wydzial" ;
    public static final String TABLE_CLASSES = "zajecia" ;
    public static final String TABLE_LECTURER = "prowadzacy" ;



    private  Connection conn;
    private  Statement stat;
    public boolean open() {
        try {
            Connection conn = DriverManager.getConnection((CONNECTION_STRING));
            Statement stat = conn.createStatement();
            return true;
        } catch (SQLException e) {
            System.out.println("COS POSZLO NIE TAK" + e.getMessage());
            return false;
        }
    }

    public void close() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("COS POSZLO NIE TAK" + e.getMessage());
        }
    }



    public boolean createTables()  {
        String createAdmin = "CREATE TABLE IF NOT EXISTS admin(admin_id INTEGER PRIMARY KEY AUTOINCREMENT, login varchar(255), password varchar(255))";
        String createAdres = "CREATE TABLE IF NOT EXISTS adress (adress_id INTEGER PRIMARY KEY AUTOINCREMENT, adress_city varchar(255), adress_street varchar(255), adress_building_nr int, string post_code)";
        String createClasses = "CREATE TABLE IF NOT EXISTS classes (classes_id INTEGER PRIMARY KEY AUTOINCREMENT, classes_name varchar(255), lecturer_id INTEGER foregin key, semester int, type varchar(255)";
        String createFaculty = "CREATE TABLE IF NOT EXISTS faculty(faculty_id INTEGER PRIMARY KEY AUTOINCREMENT, tel_nr varchar(255), adres_id INTEGER FOREGIN KEY)";
        String createGroup = "CREATE TABLE IF NOT EXISTS group(group_id INTEGER PRIMARY KEY AUTOINCREMENT, group_nr int, student_nr int)";
        String createLecturer = "CREATE TABLE IF NOT EXISTS lecturer(lecturer_id INTEGER PRIMARY KEY AUTOINCREMENT, name varchar(255), sur_name varchar(255),email varchar(255), tel_nr varchar(255), title varchar(255), login varchar(255), haslo varchar(255)";
        String createMaterials = "CREATE TABLE IF NOT EXISTS materials(content varchar(255),author varchar(255), access varchar(255)";
        String createStudent = "CREATE TABLE IF NOT EXISTS student(lecturer_id INTEGER PRIMARY KEY AUTOINCREMENT, name varchar(255), sur_name varchar(255),email varchar(255), tel_nr varchar(255), title varchar(255), login varchar(255), haslo varchar(255)";
        String createUniversity = "CREATE TABLE IF NOT EXISTS university(university_name varchar(255),website varchar(255),tel_nr varchar(255), adres_id varchar(255)";

        try {
            stat.execute(createAdres);
            stat.execute(createClasses);
            stat.execute(createFaculty);
            stat.execute(createGroup);
            stat.execute(createLecturer);
            stat.execute(createMaterials);
            stat.execute(createStudent);
            stat.execute(createUniversity);

        } catch (SQLException e) {
            System.err.println("Blad przy tworzeniu tabeli");
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public boolean insertAdimi(String login, String password) {
        try {
            PreparedStatement prepStmt = conn.prepareStatement("INSERT INTO adress values (?, ?)");
            prepStmt.setString(1,login);
            prepStmt.setString(2, password);
            prepStmt.execute();
        } catch (SQLException e) {
            System.err.println("Blad przy wstawianiu adress");
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public boolean insertAdress(String adress_city, String adress_street, int adress_building_nr, String post_code) {
        try {
            PreparedStatement prepStmt = conn.prepareStatement("INSERT INTO adress values (?, ?, ?, ?)");
            prepStmt.setString(1,adress_city);
            prepStmt.setString(2, adress_street);
            prepStmt.setInt(3, adress_building_nr);
            prepStmt.setString(4, post_code);
            prepStmt.execute();
        } catch (SQLException e) {
            System.err.println("Blad przy wstawianiu adress");
            e.printStackTrace();
            return false;
        }
        return true;
    }


    public boolean insertClasses(String classes_name, int lecturer_id, int semester, String type) {
        try {
            PreparedStatement prepStmt = conn.prepareStatement("INSERT INTO classes values(?,?,?,?,?)");
            prepStmt.setString(1,classes_name);
            prepStmt.setInt(2, lecturer_id);
            prepStmt.setInt(3, semester);
            prepStmt.setString(4, type);
            prepStmt.execute();
        } catch (SQLException e) {
            System.err.println("Blad przy wstawianiu classes");
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public boolean insertFaculty(String faculty_name, String tel_nr, int adres_id) {
        try {
            PreparedStatement prepStmt = conn.prepareStatement("INSERT INTO faculty values(?,?,?,?,?)");
            prepStmt.setString(1,faculty_name);
            prepStmt.setInt(2, adres_id);
            prepStmt.setString(4, tel_nr);
            prepStmt.execute();
        } catch (SQLException e) {
            System.err.println("Blad przy wstawianiu faculty");
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public boolean insertGroup(int group_nr, int student_nr) {
        try {
            PreparedStatement prepStmt = conn.prepareStatement("INSERT INTO group(?,?,?)");
            prepStmt.setInt(1,group_nr);
            prepStmt.setInt(2, student_nr);
            prepStmt.execute();
        } catch (SQLException e) {
            System.err.println("Blad przy wstawianiu group");
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public boolean insertLecturer(String name, String sur_name, String email, String tel_nr, String title, String login, String password) {
        try {
            PreparedStatement prepStmt = conn.prepareStatement("INSERT INTO Lecturer(?,?,?,?,?,?,?)");
            prepStmt.setString(1,name);
            prepStmt.setString(2, sur_name);
            prepStmt.setString(3, email);
            prepStmt.setString(4, tel_nr);
            prepStmt.setString(5,title);
            prepStmt.setString(6, login);
            prepStmt.setString(7, password);
            prepStmt.execute();
        } catch (SQLException e) {
            System.err.println("Blad przy wstawianiu lecturer");
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public boolean insertStudent(String name, String sur_name, String index, String email, String tel_nr, String login, String password, int year, int group_id) {

        try {
            PreparedStatement prepStmt = conn.prepareStatement("(?,?,?,?,?,?,?),\n");
            prepStmt.setString(1,name);
            prepStmt.setString(2, sur_name);
            prepStmt.setString(3, email);
            prepStmt.setInt(4,year);
            prepStmt.setString(5, index);
            prepStmt.setString(6, login);
            prepStmt.setString(7, password);
            prepStmt.execute();
        } catch (SQLException e) {
            System.err.println("Blad przy wstawianiu Student");
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public boolean insertMaterials(String content, String author, String access) {
        try {
            PreparedStatement prepStmt = conn.prepareStatement("INSERT INTO classes(?,?,?)");
            prepStmt.setString(1,content);
            prepStmt.setString(2, author);
            prepStmt.setString(3, access);
            prepStmt.execute();
        } catch (SQLException e) {
            System.err.println("Blad przy wstawianiu materials");
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public boolean insertUniversity(String university_name,String website, String tel_nr, int adres_id)
    {
        try {
            PreparedStatement prepStmt = conn.prepareStatement("INSERT INTO university(?, ?, ?,?)");
            prepStmt.setString(1,university_name);
            prepStmt.setString(2, website);
            prepStmt.setString(3, tel_nr);
            prepStmt.setInt(4, adres_id);
            prepStmt.execute();
        } catch (SQLException e) {
            System.err.println("Blad przy wstawianiu university");
            e.printStackTrace();
            return false;
        }
        return true;
    }


}


