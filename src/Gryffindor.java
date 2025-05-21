public class Gryffindor extends HogwartsStudent {
    private final int bravery;
    private final int honor;
    private final int nobility;

    public Gryffindor(String name, int magicPower, int transgressionDistance,
                      int bravery, int honor, int nobility) {
        super(name, magicPower, transgressionDistance);
        this.bravery = bravery;
        this.honor = honor;
        this.nobility = nobility;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Отвага: " + bravery);
        System.out.println("Честь: " + honor);
        System.out.println("Благородство: " + nobility);
    }

    public static void compare(Gryffindor s1, Gryffindor s2) {
        int score1 = s1.bravery + s1.honor + s1.nobility;
        int score2 = s2.bravery + s2.honor + s2.nobility;
        System.out.println("Сравнение Гриффиндорцев:");
        if (score1 > score2) {
            System.out.println(s1.getName() + " лучше " + s2.getName());
        } else if (score1 < score2) {
            System.out.println(s2.getName() + " лучше " + s1.getName());
        } else {
            System.out.println("Они равны.");
        }
    }
}
