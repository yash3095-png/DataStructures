import java.util.Arrays;
import java.util.List;

public class TestGame {
public String runTest(boolean spinner, boolean roller) {
List bottles = Arrays.asList("glass", "plastic");
for (int type = 0; type < bottles.size();) {
System.out.print(bottles.get(type) + ",");
break;
}
System.out.print("end");
}
}
