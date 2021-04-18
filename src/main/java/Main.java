public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Sergey", "Petrov");
        System.out.println(person1.toString());

        Person person4 = new PersonBuilder()
                .withName("Tiam")
                .withSurname("Martin")
                .withAge(12)
                .build();

        person4.setAddress("San Francisco");

        person4.happyBirthday();

      //  System.out.println(person1.toString());

        System.out.println(person4.toString());

//        System.out.println("Возраст " + person4.getName() + " введен: " + person4.hasAge());
//        System.out.println("Возраст " + person1.getName() + " введен: " + person1.hasAge());
//        System.out.println(person1.hasAddress());
//        System.out.println(person4.hasAddress());

        Person daughter = person4.newChildBuilder("Kathi",3)
                .build();
        System.out.println(daughter.toString());
    }
}
