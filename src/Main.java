public class Main {
    public static void main(String[] args) {
        System.out.println(Util.DOLARES);
        System.out.println(Util.EUROS);
        System.out.println(Util.ARGENTINOS);

        double pesos;
        pesos=Util.bolivianosPesos(1000);
        System.out.println(pesos);
    }
}
