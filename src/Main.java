// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Weapon weapon = new Weapon("Gun", " AK - 74");
        Boss boss = new Boss(120, 30, weapon);
        System.out.println(" Boss healt " + boss.getHealth());
        System.out.println(" Boss domage " + boss.getDomage());
        System.out.println(" Boss weapon type " + boss.getWeapon().getType());
        System.out.println(" Boss weapon name " + boss.getWeapon().getName());

         }
    }
