package com.tester.serilization.case1;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {

        serialization();
        deserialization();
    }

    private static void deserialization() {
        try (FileInputStream fileInputStream = new FileInputStream("student.dat")) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Student student = (Student) objectInputStream.readObject();
            System.out.println(student);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void serialization() {
        try (FileOutputStream fos = new FileOutputStream("student.dat")) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            Student student1 = new Student("Amit Kumar Singh", "1", "MCA");
            oos.writeObject(student1);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
