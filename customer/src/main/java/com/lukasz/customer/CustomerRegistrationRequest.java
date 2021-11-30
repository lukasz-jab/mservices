package com.lukasz.customer;

public record CustomerRegistrationRequest(
        String firstname,
        String lastname,
        String email
) {
}
