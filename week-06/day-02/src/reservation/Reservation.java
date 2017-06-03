package reservation;

public class Reservation implements Reservationy {
  private String code;
  private String dow;

  public Reservation() {
    code = getCodeBooking();
    dow = getDowBooking();
  }

  @Override
  public String getDowBooking() {
    String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    return days[(int) (Math.random() * 7)];
  }

  @Override
  public String getCodeBooking() {
    String code = "";
    String characters = "0123456789abcdefghijklmnopqrstuvwxyz";
    for (int i = 0; i < 8; i++) {
      code += characters.charAt((int) (Math.random() * characters.length()));
    }
    return code.toUpperCase();
  }

  @Override
  public String toString() {
    return String.format("Booking# %s for %s", code, dow);
  }
}
