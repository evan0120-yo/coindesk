package com.example.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class Coindesk {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COINDESK_ID")
    private Long coindeskId;
    
    @Column(name = "UPDATE_TIME")
    private LocalDateTime updateTime;
    
    @Column(name = "CURRENCY_ID")
    private Long currencyId;	// 幣別id
    
}
