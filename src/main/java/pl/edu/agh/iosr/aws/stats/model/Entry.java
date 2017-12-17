/*
 * Copyright © 2017 and Confidential to Pegasystems Inc. All rights reserved.
 */

package pl.edu.agh.iosr.aws.stats.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "entries")
public class Entry extends BaseEntity {

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_id")

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "type")
    private String type;

    @Column(name = "description")
    private String description;

    @Column(name = "value")
    private Double value;

    @Column(name = "date")
    private Date date;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "userId=" + userId +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", value=" + value +
                ", date=" + date +
                '}';
    }
}
