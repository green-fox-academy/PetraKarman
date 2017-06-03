package creditcardAndReservation;

import creditcard.CreditCard;
import reservation.Reservation;

public  class CreditCardReservation {

  CreditCard card;
  Reservation reservation;

  public CreditCardReservation(CreditCard card, Reservation reservation) {
    this.card = card;
    this.reservation = reservation;
  }

  @Override
  public String toString() {
    return String.format("%s paid by %s", reservation, card);
  }
}
