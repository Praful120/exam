package exam;

public class Student {
    private String studentName;
    private String deptName;
    private String courseName;
    private int pastGrade;
    private int admissionFee;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getPastGrade() {
        return pastGrade;
    }

    public void setPastGrade(int pastGrade) {
        this.pastGrade = pastGrade;
    }

    public int getAdmissionFee() {
        return admissionFee;
    }

    public void setAdmissionFee(int admissionFee) {
        this.admissionFee = admissionFee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", admissionFee=" + admissionFee +
                ", pastGrade=" + pastGrade +
                ", deptName='" + deptName + '\'' +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
