import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {
    private String name;
    private String number;
    private Date birthday;
    private Date schoolStart;
    private int[] marks;

    public void setNumber(String number) {
        this.number = number;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public void setSchoolStart(String schoolStart) {
        this.schoolStart = schoolStart;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marksNumber) {
        this.marks = new int[marksNumber];
    }
    public void fillMarks()
    {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            marks[i] = scan.nextInt();
        }
    }

    public Student(String name, String number, String birthday, String schoolStart, int[] marks) throws ParseException {
        this.name = name;
        this.number = number;
        this.birthday = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
        this.schoolStart = new SimpleDateFormat("yyyy-MM-dd").parse(schoolStart);
        this.marks = marks;
    }
    public Student() throws ParseException {
        this.name = "name";
        this.number = "number";
        this.birthday =  new SimpleDateFormat("yyyy-MM-dd").parse("2002-02-11");
        this.schoolStart = new SimpleDateFormat("yyyy-MM-dd").parse("2009-09-01");
        this.marks = new int[];
    }
}

