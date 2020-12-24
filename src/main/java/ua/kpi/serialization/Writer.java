package ua.kpi.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import ua.kpi.data.Holder;

public class Writer {

  public static void main(String[] args) {
    Holder holder = new Holder("sample String" , 100500);
    try(ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("obj.dat"))){
      objOut.writeObject(holder);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
