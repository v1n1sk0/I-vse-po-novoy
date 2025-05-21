public class Ravenclaw extends HogwartsStudent {
    private final int intelligence;
    private final int wisdom;
    private final int creativity;

    public Ravenclaw(String name, int magicPower, int transgressionDistance,
                     int intelligence, int wisdom, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.creativity = creativity;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Интеллект: " + intelligence);
        System.out.println("Мудрость: " + wisdom);
        System.out.println("Творчество: " + creativity);
    }

    public static void compare(Ravenclaw s1, Ravenclaw s2) {
        int score1 = s1.intelligence + s1.wisdom + s1.creativity;
        int score2 = s2.intelligence + s2.wisdom + s2.creativity;
        System.out.println("Сравнение Когтевранцев:");
        if (score1 > score2) {
            System.out.println(s1.getName() + " лучше " + s2.getName());
        } else if (score1 < score2) {
            System.out.println(s2.getName() + " лучше " + s1.getName());
        } else {
            System.out.println("Они равны.");
        }
    }
}
