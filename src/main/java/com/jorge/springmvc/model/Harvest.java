package com.jorge.springmvc.model;
// Generated 21/07/2017 05:30:53 PM by Hibernate Tools 5.2.3.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Harvest generated by hbm2java
 */
@Entity
@Table(name = "harvest", catalog = "jito_db")
public class Harvest implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private HarvestId id;
	private User user;
	private Float weight;
	private String harvestCutDate;
	private String registrationDate;
	private String totalPrice;
	private String comments;

	public Harvest() {
	}

	public Harvest(HarvestId id, User user) {
		this.id = id;
		this.user = user;
	}

	public Harvest(HarvestId id, User user, Float weight, String harvestCutDate, String registrationDate,
			String totalPrice, String comments) {
		this.id = id;
		this.user = user;
		this.weight = weight;
		this.harvestCutDate = harvestCutDate;
		this.registrationDate = registrationDate;
		this.totalPrice = totalPrice;
		this.comments = comments;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idHarvest", column = @Column(name = "ID_HARVEST", nullable = false)),
			@AttributeOverride(name = "idUsuario", column = @Column(name = "ID_USUARIO", nullable = false)) })
	public HarvestId getId() {
		return this.id;
	}

	public void setId(HarvestId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_USUARIO", nullable = false, insertable = false, updatable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "WEIGHT", length = 45)
	public Float getWeight() {
		return this.weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	@Column(name = "HARVEST_CUT_DATE", length = 45)
	public String getHarvestCutDate() {
		return this.harvestCutDate;
	}

	public void setHarvestCutDate(String harvestCutDate) {
		this.harvestCutDate = harvestCutDate;
	}

	@Column(name = "REGISTRATION_DATE", length = 45)
	public String getRegistrationDate() {
		return this.registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	@Column(name = "TOTAL_PRICE", length = 45)
	public String getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Column(name = "COMMENTS", length = 100)
	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}