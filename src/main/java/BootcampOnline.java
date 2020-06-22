public class BootcampOnline extends OnlineCourse {
    private String teacher;
    private int consultationHour;

    public BootcampOnline(String id, double price, String title, String description, int videoLength, int timeToFinish,
    String teacher, int consultationHour) {
        super(id, price, title, description, videoLength, timeToFinish);
        this.teacher = teacher;
        this.consultationHour = consultationHour;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getConsultationHour() {
        return consultationHour;
    }

    public void setConsultationHour(int consultationHour) {
        this.consultationHour = consultationHour;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", nauczyciel: " + teacher + ", liczba godzin konsultacji: " + consultationHour;
    }
}
