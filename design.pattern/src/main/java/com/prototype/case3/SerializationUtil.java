package com.prototype.case3;

import java.io.*;

public class SerializationUtil<T> {

    public T copy(T t){
        serialization(t, t.getClass().getName());
        return  deSerialization(t.getClass().getName());
    }


    private void serialization(T t, String fileName) {
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(t);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private T deSerialization(String fileName) {
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            T t = (T) objectInputStream.readObject();
            return t;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}