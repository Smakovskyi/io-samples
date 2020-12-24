package ua.kpi;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderSample {

  public static void main(String[] args) {
    try( Reader in = new FileReader("1.txt")){
      char[] buffer = new char[1024];
      StringBuilder result = new StringBuilder();
      int size;
      while ( (size = in.read(buffer)) > 0 ){
        result.append(buffer, 0, size);
      }
      System.out.println(result);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
