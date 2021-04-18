public class PersonBuilder {
    protected String name;
    protected String surName;
    protected int age;
    protected String address;
    protected Person newPerson;
    protected final int LONGIVITY = 120;

    public PersonBuilder(){
        newPerson = new Person(name, surName, age, address);
    }

    public PersonBuilder withName(String name){
        newPerson.name = name;
        return this;
    }

    public PersonBuilder withSurname(String surName){
        newPerson.surName = surName;
        return this;
    }

    public PersonBuilder withAge(int age){
        newPerson.age = age;
        try {
            if (age < 0 || age > LONGIVITY)
                throw new IllegalArgumentException("Пожалуйста," +
                        " введите корректный возраст!");
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        }
        return this;
    }

    public PersonBuilder withAddress(String address){
        newPerson.address = address;
        return this;
    }

    public Person build(){
        try {
            if (newPerson.name == null || newPerson.surName == null)
                throw new IllegalStateException("Невозможно" +
                        " ввести информацию о человеке" +
                        " без указания Имени и Фамилии");
        } catch (IllegalStateException e){
            e.printStackTrace();
        }
        return newPerson;
    }
}
