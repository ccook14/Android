import java.util.*;

public class Treet {
	private String mAuthor;
	private String mDescription;
	private Date mCreationDate;
	
	public Treet(String author, String description, Date creationDate) {
		mAuthor = author;
		mDescription = description;
		mCreationDate = creationDate;	
	}
	
	
	public String getAuthor() {
		return mAuthor;
	}
	
	public String getDescritpion() {
		return mDescritpion();
	}
	
	public Date getCreationDate() {
		return mCreationDate();
	}
	
}

