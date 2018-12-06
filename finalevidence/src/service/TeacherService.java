package service;

import connection.MySqlConnection;
import domain.Student;
import domain.Teacher;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TeacherService {

    static Connection conn = MySqlConnection.getConnection();

    public static void createTable() {
        String sql = "create table teacher(id varchar(11) primary key, name varchar(30), "
         + "subject varchar(30), std_id varchar(11), foreign key(std_id) references student(id))";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Table Created");
        } catch (SQLException ex) {
            Logger.getLogger(TeacherService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void Insert(Teacher t) {
        String sql = "insert into teacher(id, name, subject , std_id) values(?,?,?,?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t.getId());
            ps.setString(2, t.getName());
            ps.setString(3, t.getSubject());
            ps.setString(4, t.getStd().getId());
            ps.executeUpdate();
            System.out.println("Data Inserted");
        } catch (SQLException ex) {
            Logger.getLogger(TeacherService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void Update(Teacher t) {
        String sql = "update teacher set name=?, subject=? , std_id=? where id=?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, t.getName());
            ps.setString(2, t.getSubject());
            ps.setString(3, t.getStd().getId());
            ps.setString(4, t.getId());
            ps.executeUpdate();
            System.out.println("Data Update");
        } catch (SQLException ex) {
            Logger.getLogger(TeacherService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void Delete(Teacher t) {
        String sql = "delete from teacher where id=?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t.getId());

            ps.executeUpdate();
            System.out.println("Data Delete");
        } catch (SQLException ex) {
            Logger.getLogger(TeacherService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static List<Teacher> getTeacherList() {
        List<Teacher> list = new ArrayList<>();

        String sql = "select * from teacher";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Teacher t = new Teacher();
                t.setId(rs.getString(1));
                t.setName(rs.getString(2));
                t.setSubject(rs.getString(3));
                Student s = new Student();
                s.setId(rs.getString(4));
                t.setStd(s);
                list.add(t);

            }

        } catch (SQLException ex) {
            Logger.getLogger(TeacherService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static Teacher getTeacherID(String teacherID) {
        Teacher t = new Teacher();
        String sql = "select * from teacher where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, teacherID);
            
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {                
                t.setId(rs.getString(1));
                t.setName(rs.getString(2));
                t.setSubject(rs.getString(3));
                Student s=new Student();
                s.setId(rs.getString(4));
                t.setStd(s);
            }

        } catch (SQLException ex) {
            Logger.getLogger(TeacherService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return t;
    }
}
