package entities;

import java.util.Date;

public class Post {
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	private Comment comment;
	
	public Post() {
		
	}
	
	public Post(Date moment, String title, String content, Integer likes,Comment comment) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
		this.comment = comment;
	}
	
	public Date getMoment() {
		return moment;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public Integer getLikes() {
		return likes;
	}
	public Comment getComment() {
		return comment;
	}
	
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String Content) {
		this.content = content;
	}
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	public void setComment(Comment comment) {
		this.comment = comment;
	}
}
