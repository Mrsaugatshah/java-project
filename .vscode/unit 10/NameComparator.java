import java.util.*;

public class NameComparator implements Comparator<Student> {

    public int campare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}
