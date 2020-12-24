package ua.kpi.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import ua.kpi.data.Holder;

public class Writer {

  public static void main(String[] args) throws IOException {
    Holder holder = new Holder("sample String" , 100500);
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    String string = objectMapper.writeValueAsString(holder);
    System.out.println(string);
    try(FileOutputStream writer = new FileOutputStream("json.txt")) {
      objectMapper.writeValue(writer, holder);
    }
  }

}
