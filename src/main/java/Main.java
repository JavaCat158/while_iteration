

public class Main {
    public static void main(String[] args) {
        for(int a : new Randoms(90, 100)) {
            System.out.println("Next level " + a);
            if (a == 100) {
                System.out.println("Stop this shit");
                break;
            }
        }
    }
}
