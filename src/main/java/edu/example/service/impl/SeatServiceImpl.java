package edu.example.service.impl;

import edu.example.model.Seat;
import edu.example.repository.SeatRepository;
import edu.example.service.SeatService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatServiceImpl implements SeatService {

    private final SeatRepository seatrepository;

    public SeatServiceImpl(SeatRepository seatrepository) {
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

    @Override
    public Seat getSeatById(Long id) {
        return null;
    }
}

