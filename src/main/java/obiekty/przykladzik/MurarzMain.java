package obiekty.przykladzik;

public class MurarzMain {

    //psvm
    public static void main(String[] args) {

        // Konstruuje obiek:
        Murarz janek = new Murarz("Janek");


        // dzieki zmiennej 'janek' mogę znależć murarza w pamięci komputra

        janek.murujSciane();





 //       janek.dodawanie(88, 81281);
 //       int dodawanie = janek.dodawanie(88, 81281);
 //       System.out.println(dodawanie);

        System.out.println(janek.getImie());

        janek.setImie("Paaancery chomik");

        System.out.println(janek.getImie());



    }
}
