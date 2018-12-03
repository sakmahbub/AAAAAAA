/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EvidenceThree;

/**
 *
 * @author MAHBUB
 */
public class Student {
    String name;
    String email;
    int age;
    String gender;
    String hobby;
    String round;
    String note;

    public Student() {
    }

    public Student(String name, String email, int age, String gender, String hobby, String round, String note) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
        this.round = round;
        this.note = note;
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

    public String getHobby() {
        return hobby;
    }

    public String getRound() {
        return round;
    }

    public String getNote() {
        return note;
    }
    
    
}
