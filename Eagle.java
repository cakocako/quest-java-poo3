public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public void land(){
        
    }

    @Override
    public void glide() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf("%s glides into the air.%n", this.getName());
        }
    }

    @Override
    public int descend (int meters){
        if (this.flying) {
            this.altitude = Math.min(this.altitude + meters, 325);
            System.out.printf("%s flies downward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    @Override
    public int ascend(int meters) {
        if (this.flying) {
            this.altitude = Math.min(this.altitude + meters, 325);
            System.out.printf("%s flies downward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    @Override
    public void takeOff() {
        System.out.println();
    }


}
