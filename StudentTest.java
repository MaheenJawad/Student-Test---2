public class StudentTest {
    public static void main(String[] args) {
        InPerson student1 = new InPerson("Maheen", "maheen03@gmail.com", "1234567890");
        WorldCampus student2 = new WorldCampus("Zayd", "zayd03@gmail.com", "0987654321");

        student1.displayGrade();
        student1.attendInPersonMeeting();

        student2.displayGrade();
        student2.attendZoomMeeting();
    }
}