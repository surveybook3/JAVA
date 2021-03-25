package obiekty.przykladzik;

public class Murarz {

    //pola - w niech przechowujemy stan obiektu. Czyli np imie, wiek, cene produktu itp
    private String imie;

    // konsturktor - spacjalnia metoda, ktora TWORZY obiekt z tej templatki jaką jest klasa
    public Murarz(String imie) {
        this.imie = imie;
    }


    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }


    // metody - one sa po to, bo obiekt istnieje tylko po to by robil cos. Np - murarz muruje, telefon  dzwoni, pisak pisze itp itd
    public void murujSciane() {
        System.out.println("Ja - " + imie + " muruje sciane");
    }





 //   public int dodawanie(int a, int b) {
 //       int wynik = a + b;
 //       return wynik;
 //     }


}
