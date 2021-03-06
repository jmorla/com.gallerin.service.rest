package com.gallerin.domain;

import java.util.Date;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@SuppressWarnings("deprecation")
@NodeEntity
public class Bird {
	
	@GraphId
	private Long 	id;
	private String	birdId;
	private Date 	birth;
	private String  alias;
	private Integer plate;
	private String  scrath;
	private Date 	died;
	private String  status;
	private String  enrace;
	private String 	comment;
	private String 	color;
	private String 	crest;
	private String  plateType;
	
	@Relationship(type = "OWNER", direction = Relationship.OUTGOING)
	private User 	user;
	
	@Relationship(type = "FATHER", direction = Relationship.OUTGOING)
	private Rooster father;
	
	@Relationship(type = "MOTHER", direction = Relationship.OUTGOING)
	private Hen 	mother;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBirdId() {
		return birdId;
	}
	public void setBirdId(String birdId) {
		this.birdId = birdId;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public Integer getPlate() {
		return plate;
	}
	public void setPlate(Integer plate) {
		this.plate = plate;
	}
	public String getScrath() {
		return scrath;
	}
	public void setScrath(String scrath) {
		this.scrath = scrath;
	}
	public Date getDied() {
		return died;
	}
	public void setDied(Date died) {
		this.died = died;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEnrace() {
		return enrace;
	}
	public void setEnrace(String enrace) {
		this.enrace = enrace;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCrest() {
		return crest;
	}
	public void setCrest(String crest) {
		this.crest = crest;
	}
	public String getPlateType() {
		return plateType;
	}
	public void setPlateType(String plateType) {
		this.plateType = plateType;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Rooster getFather() {
		return father;
	}
	public void setFather(Rooster father) {
		this.father = father;
	}
	public Hen getMother() {
		return mother;
	}
	public void setMother(Hen mother) {
		this.mother = mother;
	}
}