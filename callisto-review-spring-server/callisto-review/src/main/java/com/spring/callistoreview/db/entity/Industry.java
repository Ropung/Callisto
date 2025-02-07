package com.spring.callistoreview.db.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Industry {

    @Id @GeneratedValue
    @Type(type="uuid-char")
    private UUID industryId;

    private String industryName;

    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime updatedAt = LocalDateTime.now();

    private LocalDateTime deletedAt;


    public void setIndustryId(UUID industryId) {
        this.industryId = industryId;
    }
    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }
}
