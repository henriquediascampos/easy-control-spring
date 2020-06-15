package com.easycontrol.models.balanceType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "tb_balace_type")
public class BalanceType extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @NotNull
    private String describle;
    @Enumerated(EnumType.STRING)
    private EtypeBalance type;
    @NotNull
    @JoinColumn(
        name = "user_id",
        referencedColumnName = "id",
        foreignKey =  @ForeignKey(name = "baty_user_fk")
    )
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @JoinColumn(
        name = "family_id",
        referencedColumnName = "id",
        foreignKey =  @ForeignKey(name = "baty_fami_fk")
    )
    @ManyToOne(fetch = FetchType.LAZY)
    private Family family;
}