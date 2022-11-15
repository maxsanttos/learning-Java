package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation2;

public class Index {

    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
    
        System.out.print("Room number: ");
        int number = sc.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        if(!checkOut.after(checkIn)){
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        }else{
            Reservation2 res = new Reservation2(number, checkIn, checkOut);
            System.out.println("Reservation: " + res);
            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            String error = res.updateDates(checkIn, checkOut);
            if (error != null) {
                System.out.println("Erro in reservation: " + error);
            }
            else{
                System.out.println("Reservation: " + res);
            }
        }
        sc.close();
    }
}