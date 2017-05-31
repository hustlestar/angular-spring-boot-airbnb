package com.hustlestar.airbnb.controller;

import com.hustlestar.airbnb.model.request.ReservationRequest;
import com.hustlestar.airbnb.model.response.ReservationResponse;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

/**
 * Created by dell on 30.05.2017.
 */
@RestController
@RequestMapping(value = ResourceConstants.ROOM_RESERVATION_V1)
public class ReservationResource {


    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ReservationResponse> getAvailableRooms(
            @RequestParam
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
                    LocalDate checkin,
            @RequestParam
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
                    LocalDate checkout
    ) {
        return new ResponseEntity<>(new ReservationResponse(), HttpStatus.OK);
    }

    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ReservationResponse> createReservation(
            @RequestBody
                    ReservationRequest reservationRequest
    ) {
        return new ResponseEntity<ReservationResponse>(new ReservationResponse(), HttpStatus.CREATED);
    }

    @PutMapping(path = "", produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ReservationResponse> updateReservation(
            @RequestBody
                    ReservationRequest reservationRequest
    ) {
        return new ResponseEntity<ReservationResponse>(new ReservationResponse(), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{reservationId}")
    public ResponseEntity<Void> deleteReservation(
            @PathVariable
                    Long reservationId
    ) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
