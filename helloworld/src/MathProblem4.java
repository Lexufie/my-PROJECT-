
public class MathProblem4 {

    public static void main(String[] args) {
        int totalStickers = findInitialDanStickers();
        System.out.println("Dan had " + totalStickers + " stickers initially.");
    }

    public static int findInitialDanStickers() {
        int jeffStickers = 0;
        int danStickers = 0;

        // Assume Jeff has 100 stickers to start with
        jeffStickers = 100;

        // Calculating Dan's stickers using the given conditions
        danStickers = jeffStickers / 2; // Dan had 50% fewer stickers than Jeff
        jeffStickers -= 20; // Jeff gave 20 stickers to Dan
        danStickers += 20; // Dan received 20 stickers from Jeff
        jeffStickers -= (jeffStickers * 0.4); // Jeff had 40% fewer stickers left after giving away 20 stickers

        return danStickers;
    }
}

