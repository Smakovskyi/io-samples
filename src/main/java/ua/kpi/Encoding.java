package ua.kpi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Encoding {

  public static void main(String[] args) {
    try (Writer writer = new OutputStreamWriter( new FileOutputStream("./ukr.txt"),
                                                  "UTF-8" )) {
      writer.write("Привіт world ");

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
