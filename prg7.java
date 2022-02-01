class collision {
    String i, j;

    collision(String a, String b) {
        i = a;
        j = b;
    }

    void check() {
        try {
            if (i == j) {
                System.out.println("The two vehicle are moving in same direction,hence no problems");
            }

            else {
                throw new Exception("the two vehicle are moving in different directions,so collision occurs");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Program7 {
    public static void main(String[] args) {
        collision s = new collision("north", "north");
        collision n = new collision("north", "east");
        s.check();
        n.check();
        System.out.println();
    }
}
