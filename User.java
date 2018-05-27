import java.util.GregorianCalendar;

public class User {
    private String name;
    private String surname;
    private GregorianCalendar dateOfBirth;
    private int day, month, year;

    public User(String name, String surname, int day, int month, int year) {
        this.name = name;
        this.surname = surname;
        if (day > 31){
            this.day = 31;
        } else {
            this.day = day;
        }
        if (month > 12){
            this.month = 12;
        }else {
            this.month = month;
        }
        this.year = year;
        dateOfBirth = new GregorianCalendar(day, month, year);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear(){
        return year;
    }

    public String firstName(){
        String a = name;
        String a2 = a.substring(0,3);
        return a2;
    }

    public  String secondName(){
        String b = surname;
        String b2 = b.substring(0,3);
        return b2;
    }

    public String birth(){
        String c = String.valueOf(year);
        String c2 = c.substring(2);
        return c2;
    }

    public String toString(){
        return (" " + secondName() + firstName() + birth());
    }

}


