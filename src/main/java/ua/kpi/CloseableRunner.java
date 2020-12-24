package ua.kpi;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CloseableRunner {

  public static void main(String[] args) {
    //FilterInputStream
    try(InputStream input = new BufferedInputStream(
        new FileInputStream("./ukr.txt"))){
      int data;
      while( (data = input.read())!= -1 ){
        System.out.println(String.format("%02X", data));
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
