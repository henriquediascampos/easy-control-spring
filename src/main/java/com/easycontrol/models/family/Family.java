package com.easycontrol.models.family;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.easycontrol.models.abstracts.AbstractEntity;
import com.easycontrol.models.user.User;

@Entity
@Table(name = "tb_family")
public class Family extends AbstractEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID uuid;

    @NotNull
    private String name;

    @JoinColumn(
        name = "user_root_fk",
        foreignKey = @ForeignKey(name = "fami_user_fk")
    )
    @OneToOne
    @NotNull
    private User userRoot;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}