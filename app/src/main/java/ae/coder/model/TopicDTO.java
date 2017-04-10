package ae.coder.model;



import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by almehairbi on 2/23/17.
 */


public class TopicDTO implements Serializable {

    private int id;
    private int courseId;
    private String topicName;
    private int topicNumber;
    private Set<LessonDTO> lessons = new HashSet<>();
    
    public TopicDTO() {
		// TODO Auto-generated constructor stub
	}

    public TopicDTO(int id, int courseId, String topicName, int topicNumber) {
        this.id = id;
        this.courseId = courseId;
        this.topicName = topicName;
        this.topicNumber = topicNumber;
    }

    public int getId() {
        return id;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public int getTopicNumber() {
        return topicNumber;
    }

    public void setTopicNumber(int topicNumber) {
        this.topicNumber = topicNumber;
    }

    public Set<LessonDTO> getLessons() {
        return lessons;
    }

    public void setLessons(Set<LessonDTO> lessons) {
        this.lessons = lessons;
    }
}
