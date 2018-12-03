/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EvidenceTwo;

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
public class Utils {

    public static void main(String[] args) {

    }

    public static void writeTofile(String filename, List<Student> students) throws Exception {
        File nFile = new File(filename + ".txt");

        try {
            if (nFile.exists() == false) {
                System.out.println("Make a new file");
                nFile.createNewFile();

            }
            PrintWriter pWrite = new PrintWriter(new FileWriter(nFile, true));
            for (Student s : students) {
                pWrite.append(s.getName() + ", " + s.getEmail() + ", " + s.getAge() + ", " + s.getGender() + ", " + s.getHobby() + ", " + s.getRound() + ", " + s.getNote() + "\n");

            }
            pWrite.close();
        } catch (Exception e) {
        }

    }
    
    public static void displayStudentDataFromFile(String filename, DefaultTableModel model){
        String line;
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename +".txt"));
            
            while ((line=reader.readLine()) != null) {                
                model.addRow(line.split(", "));
            }
            reader.close();
        } catch (Exception e) {
        }
    
    
    }
    
    
    
}
