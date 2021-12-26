package ya.danvu;

public class Liberal extends Human {

    public Liberal(String name) {

        super(name);
    }

    Liberal sayRespectToNavalniy() {
        System.out.println( name + " Ненавидит путина и Россия будет свободной!");
        return this;
    }
}
