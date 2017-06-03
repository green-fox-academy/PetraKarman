package creditcardAndReservation;

import creditcard.CreditCard;
import reservation.Reservation;

public class CreditCardReservationApp {
  public static void main(String[] args) {
    System.out.println(new CreditCardReservation(new CreditCard("Petra"),new Reservation()));
    System.out.println(new CreditCardReservation(new CreditCard("Andris"),new Reservation()));

  }
}
