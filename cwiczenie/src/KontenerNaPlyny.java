public class KontenerNaPlyny extends Kontener implements IHazardNotifier{
    public boolean niebezpieczny;
    KontenerNaPlyny(int masaLadunku, int wysokosc, int wagaWlasna, int glebokosc, String numerSeryjny, int maksymalnaLadownosc, boolean niebezpieczny) {
        super(masaLadunku, wysokosc, wagaWlasna, glebokosc, numerSeryjny, maksymalnaLadownosc);
        this.niebezpieczny = niebezpieczny;
    }

    @Override
    public void zaladujLadunek(int masaLadunku){
        if(niebezpieczny) {
            maksymalnaLadownosc *= 0.5;
        }else{
            maksymalnaLadownosc *= 0.9;
        }
        if(masaLadunku > maksymalnaLadownosc) notifyHazard(numerSeryjny);
    }

    @Override
    public void notifyHazard(String containerNumber) {
        System.out.println("Hazard: " + containerNumber);
    }
}
