public class Slytherin extends HogwartsStudent {
    private final int ambition;
    private final int cunning;
    private final int resourcefulness;

    public Slytherin(String name, int magicPower, int transgressionDistance,
                     int ambition, int cunning, int resourcefulness) {
        super(name, magicPower, transgressionDistance);
        this.ambition = ambition;
        this.cunning = cunning;
        this.resourcefulness = resourcefulness;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Амбиции: " + ambition);
        System.out.println("Хитрость: " + cunning);
        System.out.println("Находчивость: " + resourcefulness);
    }

    public static void compare(Slytherin s1, Slytherin s2) {
        int score1 = s1.ambition + s1.cunning + s1.resourcefulness;
        int score2 = s2.ambition + s2.cunning + s2.resourcefulness;
        System.out.println("Сравнение Слизеринцев:");
        if (score1 > score2) {
            System.out.println(s1.getName() + " лучше " + s2.getName());
        } else if (score1 < score2) {
            System.out.println(s2.getName() + " лучше " + s1.getName());
        } else {
            System.out.println("Они равны.");
        }
    }
}
