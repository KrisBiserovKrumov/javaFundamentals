package ComparingObjects;

import java.util.Comparator;

public class ComparatorPeopleByAge implements Comparator<Person> {

    @Override
    public int compare(Person firs, Person second) {
        return firs.getAge() - second.getAge();
    }
}
