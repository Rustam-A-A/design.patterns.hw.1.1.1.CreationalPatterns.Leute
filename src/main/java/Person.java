import java.lang.reflect.InaccessibleObjectException;

public class Person {
    protected  String name;
    protected  String surName;
    protected int age;
    protected String address;

    protected Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    protected Person(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public Person(String name, String surName, int age, String address) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.address = address;
    }

    public String getName(){ return name;}

    public String getSurName(){
        return surName;
    }

    public int getAge() { /*...*/
        return age;
    }

    public String getAddress() { /*...*/
        return address;
    }

    public void setAddress(String addressLine) {
        this.address = addressLine;
    }

    public void happyBirthday() {
        try {
            if (age == 0)
                throw new InaccessibleObjectException("Невозможно применить метод," +
                        " если не был ранее введен возраст человека ");
        } catch (InaccessibleObjectException e){
            e.printStackTrace();
        }
        age = age + 1;
    }

    public boolean hasAge() {return age != 0; }

    public boolean hasAddress() {return address == null; }

    public PersonBuilder newChildBuilder(String name, int age) {
        PersonBuilder kid = new PersonBuilder();
                kid.withName(name)
                .withSurname(getSurName())
                .withAddress(getAddress())
                .withAge(age);
        System.out.println("У " + getName() + " есть ребенок: " + name);
        return kid;
    }

    @Override
    public String toString(){
        return "Person: " +
                "\n     Name:   " + getName() +
                "\n     Surname:" + getSurName() +
                "\n     Age:    " + getAge() +
                "\n     Address:" + getAddress();
    }

}
