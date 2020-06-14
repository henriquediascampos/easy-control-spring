package com.easycontrol.models.session;

import java.time.ZonedDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tb_session")
public class Session extends AbstractEntity {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    
    @NotNull
    private UUID token;

    @NotNull
    @Column(columnDefinition = "boolean default false")
    private Boolean isLogged; 

    private ZonedDateTime LogoutAt;

    @ManyToOne
    @JoinColumn(
        name = "user_id",
        referencedColumnName = "id",
        foreignKey = @ForeignKey(name = "sess_user_fk")
    )
    private User user;


    Session(UUID token, User user) {
        this.token = token;
        this.user = user;
    }
}