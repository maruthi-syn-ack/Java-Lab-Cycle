class Player {
    String name;
    int age, matches, ranking;

    Player(String n, int a, int m, int r) {
        name = n;
        age = a;
        matches = m;
        ranking = r;
    }
}

class Cricket_Player extends Player {
    int hscore, baverage, bataverage;

    Cricket_Player(String n, int a, int m, int r, int hs, int ba, int balla) {
        super(n, a, m, r);
        hscore = hs;
        bataverage = ba;
        baverage = balla;
    }

    void disp() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("No. of Matches: " + matches);
        System.out.println("Highest Score: " + hscore);
        System.out.println("Batting Average: " + bataverage);
        System.out.println("Balling Average: " + baverage);
        System.out.println("Player Ranking: " + ranking);
    }
}

class Football_Player extends Player {
    int goals, gavg, pass;

    Football_Player(String n, int a, int m, int r, int g, int gaverage, int passeff) {
        super(n, a, m, r);
        goals = g;
        gavg = gaverage;
        pass = passeff;
    }

    void disp() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("No. of Matches: " + matches + "\n");
        System.out.println("No. of Goals: " + goals);
        System.out.println("Goals Average: " + gavg);
        System.out.println("Passing Efficiency: " + pass + "%");
        System.out.println("Player Ranking: " + ranking);
    }
}

class Hockey_Player extends Player {
    int goals, gavg, pass;

    Hockey_Player(String n, int a, int m, int r, int g, int gaverage, int passeff) {
        super(n, a, m, r);
        goals = g;
        gavg = gaverage;
        pass = passeff;
    }

    void disp() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("No. of Matches: " + matches);
        System.out.println("No. of Goals: " + goals);
        System.out.println("Goals Average: " + gavg);
        System.out.println("Passing Efficiency: " + pass + "%");
        System.out.println("Player Ranking: " + ranking);
    }
}

public class Program6 {
public static void main (String args[])
{
Cricket_Player C=new Cricket_Player ("Sachin Tendulkar",38,600,8,200,55,60);
Football_Player F=new Football_Player ("Sunil Chhetri",32,120,90,3,80,94);
Hockey_Player H=new Hockey_Player ("Dhanraj Pillay",32,120,90,3,80,94);
C.disp ();
F. disp ();
H. disp ();
}
}