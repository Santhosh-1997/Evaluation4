package com.masai.Serialization;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        Employee e = new Employee("1","sandy","abc@gamail.com","abc",new Address("TN","Chennai","600028"));

        File f = new File("emp.txt");
        try {
            f.createNewFile();
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(e);
            System.out.println("serialization done");

        } catch (IOException ex) {
            ex.printStackTrace();
        }



        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee e1 =  (Employee)ois.readObject();
            System.out.println(e1);
            System.out.println("deserialization done");

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }


    }


}
