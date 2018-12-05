/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import connection.MySqlConnection;
import domain.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MAHBUB
 */
public class StudentService {

    static Connection conn = MySqlConnection.getConnection();

    public static void createTable() {
        String sql = "create table student(id varchar(11) primary key, name varchar(30), email varchar(30), password varchar(15))";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Table created");

        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void Insert(Student s) {
        String sql = "insert into student(id, name, email , password) values(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getId());
            ps.setString(2, s.getName());
            ps.setString(3, s.getEmail());
            ps.setString(4, s.getPassword());
            ps.executeUpdate();
            System.out.println("Insert Data Successfully");

        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void update(Student s) {
        String sql = "update student set name=?, email=? , password=? where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getPassword());
            ps.setString(4, s.getId());
            ps.executeUpdate();
            System.out.println("Date Uptated");

        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void Delete(Student s) {
        String sql = "delete from student where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, s.getId());
            ps.executeUpdate();
            System.out.println("Date Deleted");

        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static List<Student> getStudentList() {
        List<Student> list = new ArrayList<>();
        String sql = "select * from student";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Student s = new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
//                s.setId(rs.getString(1));
//                s.setName(rs.getString(2));
//                s.setEmail(rs.getString(3));
//                s.setPassword(rs.getString(4));
                list.add(s);

            }

        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    public static Student getStudentId(String studentId) {
        Student s = new Student();
        String sql = "select * from student where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, studentId);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                s.setId(rs.getString(1));
                s.setName(rs.getString(2));
                s.setEmail(rs.getString(3));
                s.setPassword(rs.getString(4));

            }

        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }

}
