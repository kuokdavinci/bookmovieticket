package Model;

public class Chair {
    private int chair_id;
    private boolean isBooked;

    public Chair(int chairId, boolean isBooked) {
        chair_id = chairId;
        this.isBooked = isBooked;
    }

    public int getChair_id() {
        return chair_id;
    }

    public void setChair_id(int chair_id) {
        this.chair_id = chair_id;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }


}
