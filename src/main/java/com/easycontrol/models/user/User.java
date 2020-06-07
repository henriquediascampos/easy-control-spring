package com.easycontrol.models.user;

import java.util.UUID;

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

import org.hibernate.type.descriptor.sql.JdbcTypeFamilyInformation.Family;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_app")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User extends AbstractEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID uuid;
    @NotNull
    private String name;
    @NotNull
    private String lastName;
    @NotNull
    private String email;
    @NotNull
    private String password;

    User(String name) {
        this.name = name;
    }
    // @JoinColumn(
    //     name = "family_uuid",
    //     foreignKey = @ForeignKey(name="user_fami_fk"))
    // @ManyToOne(fetch = FetchType.LAZY)
    // // @Basic(fetch = FetchType.LAZY)
    // private Family family;

}