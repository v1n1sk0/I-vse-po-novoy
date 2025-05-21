public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри Поттер", 80, 70, 90, 85, 88);
        Gryffindor ron = new Gryffindor("Рон Уизли", 70, 65, 85, 80, 75);

        harry.printDescription();
        System.out.println();
        ron.printDescription();

        Gryffindor.compare(harry, ron);
        System.out.println();

        HogwartsStudent.compareStudents(harry, ron);

        System.out.println();
        Slytherin draco = new Slytherin("Драко Малфой", 75, 80, 90, 85, 88);
        draco.printDescription();

        HogwartsStudent.compareStudents(harry, draco);
    }
}