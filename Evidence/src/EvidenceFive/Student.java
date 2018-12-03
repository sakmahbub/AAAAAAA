/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EvidenceFive;

/**
 *
 * @author User
 */
public class Student {
    String id;
    String name;
    String email;
    int age;
    String gender;
    String education;
    String round;
    String note;

    public Student() {
    }

    public Student(String id, String name, String email, int age, String gender, String education, String round, String note) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.education = education;
        this.round = round;
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

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getEducation() {
        return education;
    }

    public String getRound() {
        return round;
    }

    public String getNote() {
        return note;
    }
    
    
}
