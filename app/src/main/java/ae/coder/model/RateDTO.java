package ae.coder.model;


import java.io.Serializable;

/**
 * Created by almehairbi on 2/23/17.
 */

public class RateDTO implements Serializable {


    private int id;
    private int studentId;
    private int courseId;
    private double rating;
    
    public RateDTO() {
		// TODO Auto-generated constructor stub
	}

    public RateDTO(int id, int studentId, int courseId, double rating) {
        this.id = id;
        this.studentId = studentId;
        this.courseId = courseId;
        this.rating = rating;
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

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}

