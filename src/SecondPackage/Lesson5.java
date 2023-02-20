package SecondPackage;

public class Lesson5 {
    public static void main(String[] args) {
        Human human1 = new Human("Желудок","Голова","Левая рука","Левая нога","Мозг");

        switch (human1.getHand()){

            case "Левая рука" -> System.out.println("Левая рука");
            case "Правая рука" -> System.out.println("Правая рука");
        }
        switch (human1.getLegs()){

            case "Левая нога" -> System.out.println("Левая нога");
            case "Правая нога" -> System.out.println("Правая нога");
        }


        }}
