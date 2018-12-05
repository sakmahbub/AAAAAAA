
package domain;

public class Teacher {
    
    private String id;
    private String name;
    private String subject;
    
    private Student std;

    public Teacher() {
    }

    public Teacher(String id, String name, String subject, Student std) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.std = std;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Student getStd() {
        return std;
    }

    public void setStd(Student std) {
        this.std = std;
    }

    @Override
    public String toString() {
        return "Teacher{" + "id=" + id + ", name=" + name + ", subject=" + subject + ", std=" + std + '}';
    }
    
    
}
