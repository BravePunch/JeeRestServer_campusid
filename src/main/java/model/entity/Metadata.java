package model.entity;

import model.enums.DataStatus;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Embeddable
public class Metadata {

    /* ----- ATTRIBUTES */

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private DataStatus status;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date creationDate;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date deletionDate;


    /* ----- GETTERS/SETTERS */

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DataStatus getStatus() {
        return status;
    }

    public void setStatus(DataStatus status) {
        this.status = status;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getDeletionDate() {
        return deletionDate;
    }

    public void setDeletionDate(Date deletionDate) {
        this.deletionDate = deletionDate;
    }

}
