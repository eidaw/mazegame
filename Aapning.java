public class Aapning extends HvitRute {

    public Aapning(int x, int y, Labyrint l) {
        super(x,y,l);
    }
    
    @Override
    public void finn(Rute fra) {
        if(fra!=null) {
            System.out.println("(" + this.x + "," + this.y + ")");
        }
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
