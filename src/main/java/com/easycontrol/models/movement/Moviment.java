package com.easycontrol.models.movement;

import java.math.BigDecimal;
import java.time.LocalDate;

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
import com.easycontrol.models.user.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "tb_moviment")
public class Moviment extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @NotNull
    @Column(precision = 10, scale = 10)
    private BigDecimal value;
    @NotNull
    private LocalDate movementAt;

    @NotNull
    private Boolean itsRetroactive;

    @NotNull
    @JoinColumn(
        name = "user_id",
        referencedColumnName = "id",
        foreignKey =  @ForeignKey(name = "movi_user_fk")
    )
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @JoinColumn(
        name = "family_id",
        referencedColumnName = "id",
        foreignKey =  @ForeignKey(name = "movi_fami_fk")
    )
    @ManyToOne(fetch = FetchType.LAZY)
    private Family family;
}