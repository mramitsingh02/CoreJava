package com.tester.serilization.case3;

import com.tester.serilization.case2.Student;

import java.io.*;

public class SerilizationDemo {
    public static void main(String[] args) {
        serilisation();
        deserilisation();
    }

    private static void deserilisation() {
        try (FileInputStream fileInputStream = new FileInputStream("student.dat")) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Account account = (Account) objectInputStream.readObject();
            System.out.println(account);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void serilisation() {
        try (FileOutputStream fos = new FileOutputStream("student.dat")) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            Account account = new Account("123456789", "Amit Kumar Singh", "Amit@12345");
            oos.writeObject(account);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
