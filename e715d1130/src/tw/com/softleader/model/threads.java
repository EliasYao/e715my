package tw.com.softleader.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class threads {
	@Id
	private Integer threadId;
	private String title;
	private java.util.Date dateCreated;
	private String thContent;
	private Integer hit;
	private Integer replayCount;
	private java.util.Date dateLastReplied;
	private char isReadonly;
	private char topped;
	@ManyToOne
	@JoinColumn(name = "boardId")
	private Integer boardId;
	private Integer userId;
}
