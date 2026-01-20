package edu.example.service.impl;

import edu.example.model.Seat;
import edu.example.repository.Seatrepository;
import edu.example.service.SeatService;

import java.util.List;

public class SeatServiceImpl implements SeatService {

    private final Seatrepository seatrepository;

    public SeatServiceImpl(Seatrepository seatrepository) {
        this.seatrepository = seatrepository;
    }

    @Override
    public Seat holdSeat(Long seatId, Long userID) {
        return null;
    }

    @Override
    public List<Seat> getAllSeats() {
        return List.of();
    }
}

