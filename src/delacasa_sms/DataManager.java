package delacasa_sms;
import java.io.*;
import java.util.*;
/**
 * @author Angelica DC
 */
public class DataManager {
    public void saveStudentData(List<Student> studentList) {
        try (FileOutputStream fileOut = new FileOutputStream("studentData.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(studentList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Student> loadStudentData() {
        List<Student> studentList = new ArrayList<>();
        try (FileInputStream fileIn = new FileInputStream("studentData.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            studentList = (List<Student>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return studentList;
    }
}