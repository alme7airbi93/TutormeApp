package ae.coder.model;



import java.io.Serializable;

/**
 * Created by almehairbi on 2/23/17.
 */


public class LessonDTO implements Serializable {


    private int id;
    private int topicId;
    private String lessonName;
    private int lessonNumber;
    private String materialPath;
    
    public LessonDTO() {
		// TODO Auto-generated constructor stub
	}


    public LessonDTO(int id, int topicId, String lessonName, int lessonNumber, String materialPath) {
        this.id = id;
        this.topicId = topicId;
        this.lessonName = lessonName;
        this.lessonNumber = lessonNumber;
        this.materialPath = materialPath;
    }

    public int getId() {
        return id;
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public int getLessonNumber() {
        return lessonNumber;
    }

    public void setLessonNumber(int lessonNumber) {
        this.lessonNumber = lessonNumber;
    }

    public String getMaterialPath() {
        return materialPath;
    }

    public void setMaterialPath(String materialPath) {
        this.materialPath = materialPath;
    }
}
