package Exemple;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class PersonneIOMainRead implements Serializable {
    public static void main(String[] args) {
    	ObjectInputStream in;
        try {
            FileInputStream is = new FileInputStream("file.out");
            in = new ObjectInputStream(is);
            PersonneIO p = (PersonneIO)in.readObject();
            PersonneIO p2 = (PersonneIO)in.readObject();
            System.out.println(p.nom + " habite " + p.m.adresse);
            System.out.println(p2.nom + " habite " + p2.m.adresse);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            in.close();
        }
        
    }
}