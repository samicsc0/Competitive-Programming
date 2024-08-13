import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> list = new ArrayList<>();
        int counter = 0, val = 0;
        for (int l : grades) {
            val = l;
            if (l < 38) {
                list.add(l);
            } else {
                while (counter < 4) {
                    if (counter == 3) {
                        counter = 0;
                        list.add(l);
                        break;
                    } else if (val % 5 == 0) {
                        list.add(val);
                        counter = 0;
                        break;
                    } else {
                        val++;
                        counter++;
                    }
                }
            }
        }
        return list;
    }
}
