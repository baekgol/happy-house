package com.ssafy.happyhouse.model.dto;

public class NewsDto {

	private String title;
	private String originallink;
	private String description;
	private String pubDate;
	
	public NewsDto(String title, String originallink, String description, String pubDate) {
		this.title = title;
		this.originallink = originallink;
		this.description = description;
		this.pubDate = pubDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOriginallink() {
		return originallink;
	}
	public void setOriginallink(String originallink) {
		this.originallink = originallink;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPubDate() {
		return pubDate;
	}
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	@Override
	public String toString() {
		return "NewsDto [title=" + title + ", originallink=" + originallink + ", description=" + description
				+ ", pubDate=" + pubDate + "]";
	}
}
