package universityenrollmentsystem;

import java.util.Comparator;

public class RoleComparator implements Comparator<Person> {

    public int getPriority(Person person) {
        if (person instanceof Student) return 1;
        if (person instanceof Lecturer) return 2;
        if (person instanceof ResearchAssistant) return 3;
        return 4;
    }

    @Override
    public int compare(Person p1, Person p2) {
        return  getPriority(p1) - getPriority(p2);
    }
}
