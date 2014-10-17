package com.sputnik.donation;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "donations")
public class DonationEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column
    private long amount;

    @Column(name="userid")
    private long userId;

    @Column(name="campaignid")
    private long campaignId;

    @Column(name="remoteid")
    private String remoteId;

    public DonationEntity(long amount, long userId, long campaignId, String remoteId) {
        this.amount = amount;
        this.userId = userId;
        this.campaignId = campaignId;
        this.remoteId = remoteId;
    }

    public DonationEntity() {
    }

    public long getId() {
        return id;
    }

    public long getAmount() {
        return amount;
    }

    public long getUserId() {
        return userId;
    }

    public long getCampaignId() {
        return campaignId;
    }

    public String getRemoteId() {
        return remoteId;
    }
}