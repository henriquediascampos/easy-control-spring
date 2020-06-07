package  com.easycontrol.models.abstracts;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

import org.springframework.context.annotation.ComponentScan;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@ComponentScan
@Getter @Setter
public abstract class AbstractEntity {

    @NotNull
    @Column(columnDefinition = "boolean default false")
    private Boolean exclude;
    @NotNull
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private ZonedDateTime createdAt;
    @Column
    private ZonedDateTime updatedAt;

}