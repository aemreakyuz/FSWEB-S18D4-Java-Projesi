package com.s18d4.s18d4challenge.dto;

public record AccountResponse( long id, String accountName, double moneyAmount, CustomerResponse customerResponse) {
}
