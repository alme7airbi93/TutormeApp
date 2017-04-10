package ae.coder.model;



import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by almehairbi on 2/23/17.
 */

public class ResponseDTO implements Serializable {


    private int id;
    private int courseId;
    private int userId;
    private Set<ResponseDTO> responses = new HashSet<>();
    private int responseId;
    private String text;
    
    public ResponseDTO() {
		// TODO Auto-generated constructor stub
	}


    public ResponseDTO(int id, int courseId, int userId, int responseId, String text) {
        this.id = id;
        this.courseId = courseId;
        this.userId = userId;
        this.responseId = responseId;
        this.text = text;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Set<ResponseDTO> getResponses() {
        return responses;
    }

    public void setResponses(Set<ResponseDTO> responses) {
        this.responses = responses;
    }

    public int getResponseId() {
        return responseId;
    }

    public void setResponseId(int responseId) {
        this.responseId = responseId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
