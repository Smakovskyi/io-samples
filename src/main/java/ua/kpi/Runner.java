package ua.kpi;

public class Runner {

  public static void read() throws RuntimeException{
    throw new RuntimeException("Read exception");
  }

  public static void main(String[] args) /*throws Exception*/ {
    read();
  }
}
