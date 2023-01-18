public class RollLoadedDie {
    public static void main(String[] args) {
        double roll = Math.random();
        double level = (1.0 / 8);
        if (roll <= (3 * level)) {
            System.out.println("6");
        } else if (roll > (3 * level) && roll <= (4 * level)) {
            System.out.println("1");
        } else if (roll > (4 * level) && roll <= (5 * level)) {
            System.out.println("2");
        } else if (roll > (5 * level) && roll <= (6 * level)) {
            System.out.println("3");
        } else if (roll > (6 * level) && roll <= (7 * level)) {
            System.out.println("4");
        } else if (roll > (7 * level) && roll <= (8 * level)) {
            System.out.println("5");
        } 
    

    }
}
