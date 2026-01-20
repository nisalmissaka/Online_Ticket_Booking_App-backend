package edu.example.service.impl;

import edu.example.entity.Seat;
import edu.example.repository.Seatrepository;
import edu.example.service.SeartService;

public class SeartServiceImpl implements SeartService {

    private final Seatrepository seatrepository;

    public SeartServiceImpl(Seatrepository seatrepository) {
        this.seatrepository = seatrepository;
    }

    @Override
    public Seat holdSeat(Long seatId, Long userID) {
        return null;
    }
}

