package com.ssafy.nfti.db.entity;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

@Getter
@Setter
@Entity(name = "items")
public class Items extends BaseEntity {

    private Long tokenId;

    private String itemUrl;

    private String itemTitle;

    private String itemDescription;

    private String authorName;

    private String ownerAddress;

    private String onSaleYn;

    @ManyToOne
    private Community community;

}
