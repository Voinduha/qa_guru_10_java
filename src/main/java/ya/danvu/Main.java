package ya.danvu;

public class Main {
    // модификатор доступа || static -> возвращаемое значение -> имя -> (аргементы)
    public static void main(String[] args) {
        Liberal liberal = new Liberal("Даниил");
        Liberal anotherLiberal = new Liberal("Алексей");

        liberal.age = 44;
        anotherLiberal.age = 17;

        System.out.println(liberal.name);
        System.out.println(anotherLiberal.name);

        System.out.println(liberal.age + " Года");
        System.out.println(anotherLiberal.age + " Лет");
        liberal.sayRespectToNavalniy().sayRespectToNavalniy().sayRespectToNavalniy();
        anotherLiberal.sayRespectToNavalniy();

        int liberalAge = liberal.getAge();
        System.out.println(liberalAge);
        System.out.println(anotherLiberal.age);
    }
}
