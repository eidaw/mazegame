
abstract public class Rute {

    //protected fordi vi driver med subklasser
    protected int x, y;
    protected Labyrint labyrint;
    Rute nord, soer, oest, vest;

    public Rute getOest() {
        return oest;
    }

    public Labyrint getLab() {
        return labyrint;
    }

    public Rute getNord() {
        return nord;
    }

    public Rute getSoer() {
        return soer;
    }

    public Rute getVest() {
        return vest;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setOest(Rute oest) {
        this.oest = oest;
    }

    public void setLab(Labyrint lab) {
        this.labyrint = lab;
    }

    public void setNord(Rute nord) {
        this.nord = nord;
    }

    public void setSoer(Rute soer) {
        this.soer = soer;
    }

    public void setVest(Rute vest) {
        this.vest = vest;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    abstract public String toString();
    abstract public void finn(Rute fra);

    
    
}
