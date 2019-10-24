package com.easycontrol.models.accounts;

import java.math.BigDecimal;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.easycontrol.models.abstracts.AbstractEntity;
import com.easycontrol.models.family.Family;
import com.easycontrol.models.user.User;

@Entity
public class Accounts extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;

    private String description;
    @NotNull
    @Column(
        precision = 10, scale = 4
    )
    private BigDecimal value;
    @NotNull
    private Integer numberOfInstallments;
    @NotNull
    @Column(columnDefinition = "int default 0")
    private Integer numberOfInstallmentsPaid;
    @NotNull
    @Column(columnDefinition = "boolean default false")
    private Boolean paid;

    @JoinColumn(name = "user_fk", foreignKey = @ForeignKey(name = "acco_user_fk"))
    @ManyToOne
    @NotNull
    private User user;

    @JoinColumn(name = "family_fk", foreignKey = @ForeignKey(name = "acco_fami_fk"))
    @ManyToOne
    @NotNull
    private Family family;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Integer getNumberOfInstallments() {
        return numberOfInstallments;
    }

    public void setNumberOfInstallments(Integer numberOfInstallments) {
        this.numberOfInstallments = numberOfInstallments;
    }

    public Integer getNumberOfInstallmentsPaid() {
        return numberOfInstallmentsPaid;
    }

    public void setNumberOfInstallmentsPaid(Integer numberOfInstallmentsPaid) {
        this.numberOfInstallmentsPaid = numberOfInstallmentsPaid;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

}