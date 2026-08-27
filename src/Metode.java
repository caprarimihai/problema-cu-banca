public class Metode {
    static void main(String[] args) {
        Metode maib = new Metode();
        maib.name= "maib";
        maib.procent= 7.7;
        maib.numDeClient=1000;
        Metode victoria= new Metode();
        victoria.name= "Victoria";
        victoria.numDeClient=2000;
        victoria.procent=7.8;

        System.out.println( "NUme banca"+maib.name+ "Procentul acordat"+maib.procent+  "NUmarul de clienti"+maib.numDeClient);
        System.out.println("Avem un exemplu de problema");
        System.out.println("Hai sa adaugam clienti:");
        System.out.println("Hai la hora");
    }

    String name;
    double procent;
    int numDeClient;

}
