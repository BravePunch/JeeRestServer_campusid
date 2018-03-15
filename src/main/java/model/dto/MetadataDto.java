package model.dto;

import model.enums.DataStatus;

import java.util.Date;

public class MetadataDto {

    /* ----- ATTRIBUTES */

    private Integer id;

    private DataStatus status;

    private Date creationDate;

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
