package com.example.model;

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
public class Currency {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CURRENCY_ID")
    private Long currencyId;	// 幣別id
    
    @Column(name = "UPDATE_NAME")
    private String currencyName;
    
    @Column(name = "CODE")
    private String code;
    
    @Column(name = "SYMBOL")
    private String symbol;
    
    @Column(name = "RATE")
    private Double rate;
    
    @Column(name = "DESCRIPTION")
    private String description;
    
    @Column(name = "RATE_FLOAT")
    private Double rateFloat;

}
