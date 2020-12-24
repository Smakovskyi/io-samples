package ua.kpi.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import ua.kpi.data.Holder;

public class Reader {

  public static void main(String[] args) {
    try(ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("obj.dat"))){
      Holder holder = (Holder) objIn.readObject();
      System.out.println(holder);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
