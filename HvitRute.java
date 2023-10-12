public class HvitRute extends Rute {

    public HvitRute(int x, int y, Labyrint l) {
        this.x= x;
        this.y= y;
        this.labyrint = l;
    }

    @Override
    public String toString() {
        return ".";
    }

    @Override
    public void finn(Rute fra) {

        if (this.oest != null && this.oest!= fra) {
            this.oest.finn(this);
        }
        if (this.soer != null && this.soer!=fra) {
            this.soer.finn(this);
        }
        if (this.vest != null && this.vest!=fra) {
            this.vest.finn(this);
        }
        if (this.nord != null && this.nord!=fra) {
            this.nord.finn(this);
        }

    }
    
}
