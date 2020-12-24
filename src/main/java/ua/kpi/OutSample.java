package ua.kpi;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.Writer;

public class OutSample {

  public static void main(String[] args) {
    try(Writer writer = new FileWriter("./res.txt")){
      writer.write("Hello world!");
    }catch (Exception ex){

    }

  }

}
