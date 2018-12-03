/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EvidenceFive;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MAHBUB
 */
public class Utils2 {

    public static void writeToFile(String filename, List<Student2> students) throws Exception {
        File nFile = new File(filename + ".txt");
        try {
            if (nFile.exists() == false) {
                System.out.println("Need a File");
                nFile.createNewFile();
            }
            PrintWriter pw = new PrintWriter(new FileWriter(nFile, true));
            for (Student2 s : students) {
                pw.append(s.getId() + ", " + s.getName() + ", " + s.getEmail() + ", " + s.getAge() + ", " + s.getGender() + ", " + s.getHobby() + ", " + s.getRound() + ", " + s.getNote() + "\n");

            }
            pw.close();

        } catch (Exception e) {
        }

    }

    public static void displayDataFromFile(String filename, DefaultTableModel model) {
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename + ".txt"));
            while ((line = br.readLine()) != null) {
                model.addRow(line.split(", "));
            }
            br.close();
        } catch (Exception e) {
        }
    }

}
