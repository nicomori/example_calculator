package rest;


/**
 * This Class is created for make all the calls.
 */
public class Post {

	int userId;
	int id;
	String title;
	String body;
	String email;
	
	public Post() {
		super();
	}
	
	public Post(int userId, int id, String title, String body, String email) {
		super();
		this.userId = userId;
		this.id = id;
		this.title = title;
		this.body = body;
		this.email = email;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
