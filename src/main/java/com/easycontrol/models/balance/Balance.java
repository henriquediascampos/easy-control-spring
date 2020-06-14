package com.easycontrol.models.balance;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.easycontrol.models.abstracts.AbstractEntity;
import com.easycontrol.models.family.Family;
import com.easycontrol.models.movement.Moviment;
import com.easycontrol.models.user.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "balance")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Balance extends AbstractEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    @NotNull
    @Column
    private BigDecimal value;

    @NotNull
    @JoinColumn(
        name = "user_id",
        referencedColumnName = "id",
        foreignKey =  @ForeignKey(name = "bala_user_fk")
    )
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @JoinColumn(
        name = "family_id",
        referencedColumnName = "id",
        foreignKey =  @ForeignKey(name = "bala_fami_fk")
    )
    @ManyToOne(fetch = FetchType.LAZY)
    private Family family;

    @JoinColumn(
        name = "moviment_id",
        referencedColumnName = "id",
        foreignKey =  @ForeignKey(name = "bala_movi_fk")
    )
    @ManyToOne(fetch = FetchType.LAZY)
    private Moviment moviment;
}