package com.spring.callistoreview.db.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Company {

    @Id @GeneratedValue
    @Type(type="uuid-char")
    private UUID companyId;

    private String companyName;

    @ManyToOne
    @JoinColumn(name = "industryId")
    private Industry industry;

    @OneToOne
    @JoinColumn(name = "companyImageId")
    private CompanyImage companyImage;

    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime updatedAt = LocalDateTime.now();

    private LocalDateTime deletedAt;

    public void setCompanyId(UUID companyId) {
        this.companyId = companyId;
    }

    public void setIndustry(Industry industry) {
        this.industry = industry;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
