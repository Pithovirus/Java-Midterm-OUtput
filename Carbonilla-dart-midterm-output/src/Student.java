public class Student {
    private int numAge;
    private String userName;

    public Student(int numAge, String userName) {

        this.numAge = numAge;
        this.userName = userName;

    }

    public int getNumAge() {
        return numAge;
    }

    public void setNumAge(int numAge) {
        this.numAge = numAge;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

}
