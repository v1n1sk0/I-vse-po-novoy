public class Hufflepuff extends HogwartsStudent {
    private final int loyalty;
    private final int honesty;
    private final int diligence;

    public Hufflepuff(String name, int magicPower, int transgressionDistance,
                      int loyalty, int honesty, int diligence) {
        super(name, magicPower, transgressionDistance);
        this.loyalty = loyalty;
        this.honesty = honesty;
        this.diligence = diligence;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Верность: " + loyalty);
        System.out.println("Честность: " + honesty);
        System.out.println("Трудолюбие: " + diligence);
    }

    public static void compare(Hufflepuff s1, Hufflepuff s2) {
        int score1 = s1.loyalty + s1.honesty + s1.diligence;
        int score2 = s2.loyalty + s2.honesty + s2.diligence;
        System.out.println("Сравнение Пуффендуйцев:");
        if (score1 > score2) {
            System.out.println(s1.getName() + " лучше " + s2.getName());
        } else if (score1 < score2) {
            System.out.println(s2.getName() + " лучше " + s1.getName());
        } else {
            System.out.println("Они равны.");
        }
    }
}
