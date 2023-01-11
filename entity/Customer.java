package ru.corruptzero.testbank.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
    public boolean isCreditAcceptable(Double interestRate){
        return interestRate<=10;
    }
}
