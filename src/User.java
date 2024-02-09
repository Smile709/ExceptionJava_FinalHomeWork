public class User {
        String lastName;
        String firstName;
        String middleName;
        String birthDate;
        int phoneNumber;
        char gender;

        public User(String[] data) {
            Checker checker = new Checker();
            this.lastName = data[0];
            this.firstName = data[1];
            this.middleName = data[2];
            this.birthDate = checker.dataChecker(data[3]);
            this.phoneNumber = checker.phoneChecker(data[4]);
            this.gender = checker.genderChecker(data[5]);
        }
    @Override
    public String toString() {
        return String.format("<%s> <%s> <%s> <%s> <%s> <%s>\n", lastName, firstName, middleName, birthDate, phoneNumber, gender);
        }
    }
