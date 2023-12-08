public class Student {
    private String forNamn;
    private String efterNamn;
    private String startTermin;
    private String epost;
    private String userName;

    public Student() {
    }

    public Student(String forNamn, String efterNamn, String startTermin, String epost, String userName) {
        this.forNamn = forNamn;
        this.efterNamn = efterNamn;
        this.startTermin = startTermin;
        this.epost = epost;
        this.userName = userName;
    }

    public void setForNamn(String forNamn) {
        this.forNamn = forNamn;
    }

    public void setEfterNamn(String efterNamn) {
        this.efterNamn = efterNamn;
    }

    public void setStartTermin(String startTermin) {
        this.startTermin = startTermin;
    }

    public String getForNamn() {
        return forNamn;
    }

    public String getEfterNamn() {
        return efterNamn;
    }

    public String getUserName() {
        return startTermin.toLowerCase() + forNamn.substring(0, 3).toLowerCase() +
                efterNamn.substring(0, 2).toLowerCase();    }

    public String getStartTermin() {
        return startTermin;
    }

    public String getEpost() {
        return getUserName() + "@du.se";
    }

    public String toString() {
        return "Name: " + forNamn + "\nLast Name: " + efterNamn + "\nStart Year: " + startTermin +
                "\nUsername: " + userName + "\nEmail: " + epost;
    }
}
