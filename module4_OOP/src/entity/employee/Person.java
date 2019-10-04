package entity.employee;

import java.util.Optional;


public abstract class Person {

    private Optional<String> firstName;
    private Optional<String> secondName;
    private Optional<Integer> age;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }




}
