package ua.kpi.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import ua.kpi.data.Holder;

public class Reader {

  public static void main(String[] args) {
    ObjectMapper mapper = new ObjectMapper();
    try(InputStream in = new FileInputStream("json.txt")) {
      Holder holder = mapper.readValue(in, Holder.class);
      System.out.println(holder);

    }catch (Exception ex){
      ex.printStackTrace();
    }
  }

}
