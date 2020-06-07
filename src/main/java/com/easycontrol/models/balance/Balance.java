package com.easycontrol.models.balance;

import java.math.BigDecimal;
import java.util.UUID;
import javax.persistence.ForeignKey;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.easycontrol.models.abstracts.AbstractEntity;
import com.easycontrol.models.changeValues.ChangeValues;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "balance")
@Getter @Setter
public class Balance extends AbstractEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID uuid;
    @NotNull
    @Column
    private BigDecimal value;
    @NotNull
    @JoinColumn(
        name = "bala_uuid",
        foreignKey = @ForeignKey(name="bala_chva_fk"))
    @OneToOne(fetch = FetchType.LAZY)
    private ChangeValues changeValues;    
}