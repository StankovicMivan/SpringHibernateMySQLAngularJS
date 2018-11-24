package javaWebDevelopment.web.dto;

public class CompetitionDTO {
	
	private Long id;
	private String name;
	private long formatId;
	private String formatName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getFormatId() {
		return formatId;
	}
	public void setFormatId(long formatId) {
		this.formatId = formatId;
	}
	public String getFormatName() {
		return formatName;
	}
	public void setFormatName(String formatName) {
		this.formatName = formatName;
	}

	
}
