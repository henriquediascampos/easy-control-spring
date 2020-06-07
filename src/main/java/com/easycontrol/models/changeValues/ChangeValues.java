package com.easycontrol.models.changeValues;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.UUID;

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
import com.easycontrol.models.user.User;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "change_value")
@Getter @Setter
public class ChangeValues extends AbstractEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID uuid;
    @NotNull
    @Enumerated(EnumType.STRING)
    private ETipoChangeValue tipo;
    @NotNull
    @JoinColumn(
        name = "chva_uuid",
        foreignKey = @ForeignKey(name="chva_user_fk"))
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
    @NotNull
    private ZonedDateTime inputDate;
    @NotNull
    private BigDecimal ChangeValues;
}