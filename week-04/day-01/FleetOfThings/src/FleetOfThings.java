public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();

    Thing a = new Thing("Get milk");
    fleet.add(a);
    Thing b = new Thing("Remove the obstacles");
    fleet.add(b);
    Thing c = new Thing("Stand up");
    c.complete();
    fleet.add(c);
    Thing d = new Thing("Eat lunch");
    d.complete();
    fleet.add(d);

    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    System.out.println(fleet);
  }
}