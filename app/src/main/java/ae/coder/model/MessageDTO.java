package ae.coder.model;




import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by almehairbi on 2/23/17.
 */

public class MessageDTO implements Serializable {


    private int id;
    private int userId;
    private Set<MessageDTO> messages  = new HashSet<>();
    private int messageId;
    private int reciverId;
    private String subject;
    private String body;

	public MessageDTO() {
		// TODO Auto-generated constructor stub
	}


	public MessageDTO(String body, int id, int userId, int messageId, int reciverId, String subject) {
		this.body = body;
		this.id = id;
		this.userId = userId;
		this.messageId = messageId;
		this.reciverId = reciverId;
		this.subject = subject;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Set<MessageDTO> getMessages() {
		return messages;
	}

	public void setMessages(Set<MessageDTO> messages) {
		this.messages = messages;
	}

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public int getReciverId() {
		return reciverId;
	}

	public void setReciverId(int reciverId) {
		this.reciverId = reciverId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
}
