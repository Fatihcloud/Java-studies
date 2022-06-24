public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Talha",65,150,100,10);
        Fighter f2 = new Fighter("Fatih",45,100,85,50);

        Match match = new Match(f1,f2,85,100);
        match.run();
    }
}
