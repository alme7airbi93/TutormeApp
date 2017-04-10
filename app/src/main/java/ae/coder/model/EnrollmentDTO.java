package ae.coder.model;



import java.io.Serializable;
import java.util.Date;

/**
 * Created by almehairbi on 2/23/17.
 */


public class EnrollmentDTO implements Serializable {


    private int id;
    private int studentId;
    private int courseId;
    private Date enrolledDate;
    private double amountPaid;
    
    public EnrollmentDTO() {
		// TODO Auto-generated constructor stub
	}

    public EnrollmentDTO(int id, int studentId, int courseId, Date enrolledDate, double amountPaid) {
        this.id = id;
        this.studentId = studentId;
        this.courseId = courseId;
        this.enrolledDate = enrolledDate;
        this.amountPaid = amountPaid;
    }

    public int getId() {
        return id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public Date getEnrolledDate() {
        return enrolledDate;
    }

    public void setEnrolledDate(Date enrolledDate) {
        this.enrolledDate = enrolledDate;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }
}

