/**
 * Created by Petra on 2017. 03. 21..
 */
public class CodingHours {
  public static void main(String[] args) {
    double dailyCodingHours = 6.;
    double semesterWeeks = 17.;
    double workingDaysPerWeek = 5.;
    double codingHoursPerSemester = dailyCodingHours * semesterWeeks * workingDaysPerWeek;
    double averageWorkingHoursPerWeek = 52.;
    double averageWorkingHoursPerSemester = semesterWeeks * averageWorkingHoursPerWeek;

    System.out.println(codingHoursPerSemester );
    System.out.println(codingHoursPerSemester / averageWorkingHoursPerSemester * 100 );
    // An average Green Fox attendee codes 6 hours daily
    // The semester is 17 weeks long
    //
    // Print how many hours is spent with coding in a semester by an attendee,
    // if the attendee only codes on workdays.
    //
    // Print the percentage of the coding hours in the semester if the average
    // work hours weekly is 52
  }
}