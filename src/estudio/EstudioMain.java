package estudio;

import java.util.ArrayList;
import java.util.List;

public class EstudioMain {
    public static void main(String[] args) {
        //iGato ungato = new Cecilio("Menso", 2);
        List<iGato> lista = new ArrayList<>();
        lista.add(new Cecilio("Menso", 2));
        lista.add(new Fofo("Menso", 2));
        for(iGato i: lista){
            System.out.println(i.Meow());
        }
    }
}
