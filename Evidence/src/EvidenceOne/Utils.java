package EvidenceOne;

import evidence.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Utils {

    public static void writeToTable(String filename, List<Student> students) throws Exception {
        File nfile = new File(filename + ".txt");
        try {
            if (nfile.exists() == false) {
                System.out.println("Make a new file");
                nfile.createNewFile();
            }

            PrintWriter out = new PrintWriter(new FileWriter(nfile, true));
            for (Student s : students) {
                out.append(s.getName() + ", " + s.getEmail() + ", " + s.getAge() + ", " + s.getGender() + ", " + s.getHobby() + ", " + s.getRound() + ", " + s.getNote() + "\n");

            }
            out.close();

        } catch (Exception e) {

        }

    }

    public static void displayStudentDataFromFile(String filename, DefaultTableModel model) {
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename + ".txt"));
            while ((line = reader.readLine()) != null) {
                model.addRow(line.split(", "));

            }

            reader.close();
        } catch (Exception e) {
        }

    }

}
