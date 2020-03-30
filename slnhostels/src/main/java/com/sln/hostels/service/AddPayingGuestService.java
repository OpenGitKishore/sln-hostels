package com.sln.hostels.service;

import com.sln.hostels.model.PayingGuest;
import org.springframework.stereotype.Component;

@Component
public class AddPayingGuestService implements SLNServiceInterface {

    /**
     * This holds the paying guest details and makes req to DB for persists
     * @param payingGuest
     * @return PayingGuest
     */
    public PayingGuest postPayingGuestDetails(PayingGuest payingGuest) {
        return payingGuest;
    }
}
