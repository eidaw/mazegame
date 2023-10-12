public class SortRute extends Rute {

    public SortRute(int x, int y, Labyrint l) {
        this.x = x;
        this.y = y;
        this.labyrint = l;
    }

    @Override
    public String toString() {
        return "#";
    }

    @Override
    public void finn(Rute fra) {
        if (fra == null)
        {
            System.out.println("Kan ikke starte i sort rute.");
        }
    }

    
}
