package jdk14.feature.record;

public record Person(String name, Person partner) {
    public static String nation;

    public static String getNation() {
        return nation;
    }

    public Person(String name) {
        this(name, null);
    }

    public String getNameUpperCase() {
        return name.toUpperCase();
    }

}
