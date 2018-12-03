/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EvidenceSix;

/**
 *
 * @author User
 */
public class Student {
    String id;
    String name;
    String email;
    String password;
    String note;

    public Student() {
    }

    public Student(String id, String name, String email, String password, String note) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.note = note;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getNote() {
        return note;
    }
    
    
    
}
