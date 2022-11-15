package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation2 {
    private Integer roomNumber;
    private Date checkin;
    private Date checkout;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation2(){}

    public Reservation2(Integer roomNumber, Date checkin, Date checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public long duration(){
        long diff = checkout.getTime() - checkin.getTime();
        return  TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);
    }

    public String updateDates(Date checkin, Date checkout){

        Date now = new Date();
        if (checkin.before(now) || checkout.before(now)) {
            return "Reservation dates for update must be future dates";
        }
        if (!checkout.after(checkin)) {
            return "Check-out date must be after check-in date";
        }
        this.checkin = checkin;
        this.checkout = checkout;
        
        return null;
    }

    @Override
    public String toString(){
        return  "Room "
                + roomNumber
                + ", check-In: "
                + sdf.format(checkin)
                + ", check-Out: "
                + sdf.format(checkout)
                + " , "
                + duration()
                + " nights";
    }




}
