package ua.kpi.data;

import java.io.Serializable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Holder implements Serializable {
  private String name;
  private int value;

  public Holder(String name, int value) {
    this.name = name;
    this.value = value;
  }

  @Override
  public String toString() {
    return "Holder{" +
        "name='" + name + '\'' +
        ", value=" + value +
        '}';
  }
}
