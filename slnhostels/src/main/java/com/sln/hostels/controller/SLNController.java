package com.sln.hostels.controller;

import com.sln.hostels.model.PayingGuest;
import com.sln.hostels.service.AddPayingGuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sln/v1")
public class SLNController {

    @Autowired
    private AddPayingGuestService addPayingGuestService;

    @PostMapping(path = "add/paying-guest", consumes = "application/json", produces = "application/json")
    public ResponseEntity<PayingGuest> addPayingGuest(@RequestBody PayingGuest payingGuest) {
        return ResponseEntity.ok(addPayingGuestService.postPayingGuestDetails(payingGuest));
    }
}
