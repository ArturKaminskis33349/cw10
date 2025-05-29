public class KontenerNaGaz extends Kontener {
    KontenerNaGaz(int masaLadunku, int wysokosc, int wagaWlasna, int glebokosc, String numerSeryjny, int maksymalnaLadownosc) {
        super(masaLadunku, wysokosc, wagaWlasna, glebokosc, numerSeryjny, maksymalnaLadownosc);
    }

    @Override
    protected void oproznijLadunek(){
        masaLadunku *= 0.05;
    }
}
