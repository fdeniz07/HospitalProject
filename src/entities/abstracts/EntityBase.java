package entities.abstracts;

import java.time.LocalDateTime;

public abstract class EntityBase {

    private String id;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    private String CreatedByName;
    private String ModifiedByName;
    private boolean IsDeleted;
    private boolean IsActive;


    public EntityBase(LocalDateTime createdDate) {
        this.createdDate = createdDate=LocalDateTime.now();
    }

    public EntityBase(String id, LocalDateTime createdDate, LocalDateTime modifiedDate, String createdByName, String modifiedByName, boolean isDeleted, boolean isActive) {
        this.id = id;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        CreatedByName = createdByName;
        ModifiedByName = modifiedByName;
        IsDeleted = isDeleted;
        IsActive = isActive;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getCreatedByName() {
        return CreatedByName;
    }

    public void setCreatedByName(String createdByName) {
        CreatedByName = createdByName;
    }

    public String getModifiedByName() {
        return ModifiedByName;
    }

    public void setModifiedByName(String modifiedByName) {
        ModifiedByName = modifiedByName;
    }

    public boolean isDeleted() {
        return IsDeleted;
    }

    public void setDeleted(boolean deleted) {
        IsDeleted = deleted;
    }

    public boolean isActive() {
        return IsActive;
    }

    public void setActive(boolean active) {
        IsActive = active;
    }


}
