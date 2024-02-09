import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Checker {
    public String dataChecker(String birthDate) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.mm.yyyy");
        simpleDateFormat.setLenient(false);

        try {
            simpleDateFormat.parse(birthDate);
        } catch (ParseException e) {
            throw new RuntimeException("неверный формат даты");
        }
        return birthDate;
    }

    public int phoneChecker(String phoneNumber) {
        int phoneChecked;
        try {
            phoneChecked = Integer.parseInt(phoneNumber);
        } catch (NumberFormatException e) {
            throw new RuntimeException("неверный формат телефона");
        }
        return phoneChecked;
    }

    public char genderChecker(String gender) {
        if (!gender.toLowerCase().equals("f") && !gender.toLowerCase().equals("m")) {
            throw new RuntimeException("неверный формат пола");
        }
        return gender.toLowerCase().charAt(0);
    }
}