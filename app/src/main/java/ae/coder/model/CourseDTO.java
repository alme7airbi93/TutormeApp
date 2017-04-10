package ae.coder.model;




import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by almehairbi on 2/18/17.
 */


public class CourseDTO implements Serializable {


    private int courseId;
    private int instructorId;
    private int moderatorId;
    private String description;
    private double price;
    private String name;
    private boolean enabled;
    private double rating;
    private Set<EnrollmentDTO> enrollments = new HashSet<>();
    private Set<TopicDTO> topics = new HashSet<>();
    private Set<RateDTO> rates = new HashSet<>();
    private int categoryId;
    
    public CourseDTO() {
		// TODO Auto-generated constructor stub
	}

    public CourseDTO(int courseId, int instructorId, int moderatorId, String description, double price,
                     String name, boolean enabled, double rating, Set<TopicDTO> topics, Set<RateDTO> rates, int categoryId) {
        this.courseId = courseId;
        this.instructorId = instructorId;
        this.moderatorId = moderatorId;
        this.description = description;
        this.price = price;
        this.name = name;
        this.enabled = enabled;
        this.rating = rating;
        this.topics = topics;
        this.rates = rates;
        this.categoryId = categoryId;
    }

    public int getModeratorId() {
        return moderatorId;
    }

    public void setModeratorId(int moderatorId) {
        this.moderatorId = moderatorId;
    }

    public Set<TopicDTO> getTopics() {
        return topics;
    }

    public void setTopics(Set<TopicDTO> topics) {
        this.topics = topics;
    }

    public Set<EnrollmentDTO> getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(Set<EnrollmentDTO> enrollments) {
        this.enrollments = enrollments;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Set<RateDTO> getRates() {
        return rates;
    }

    public void setRates(Set<RateDTO> rates) {
        this.rates = rates;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
