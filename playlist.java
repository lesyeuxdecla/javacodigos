import java.util.ArrayList;
public class playlist {
    public static void main(String[] args) {
        ArrayList<String> listaParaIlhaDeserta = new ArrayList<String>();
        listaParaIlhaDeserta.add("Cruel Summer");
        listaParaIlhaDeserta.add("Lover");
        listaParaIlhaDeserta.add("The Archer");
        listaParaIlhaDeserta.add("False God");
        listaParaIlhaDeserta.add("Afterglow");
        listaParaIlhaDeserta.add("Daylight");
        listaParaIlhaDeserta.add("Cornelia Street");
        System.out.println(listaParaIlhaDeserta);
        System.out.println(listaParaIlhaDeserta.size());
        listaParaIlhaDeserta.remove(1);
        listaParaIlhaDeserta.remove(2);
        System.out.println(listaParaIlhaDeserta);
        int a = listaParaIlhaDeserta.indexOf("Afterglow");
        int b = listaParaIlhaDeserta.indexOf("The Archer");
        String tempA = listaParaIlhaDeserta.get(a);
        String tempB = listaParaIlhaDeserta.get(b);
        listaParaIlhaDeserta.set(b, tempA);
        listaParaIlhaDeserta.set(a, tempB);
        System.out.println(listaParaIlhaDeserta);
    }

}