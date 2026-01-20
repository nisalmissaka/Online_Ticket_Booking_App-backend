package edu.example.service;

import edu.example.model.Seat;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SeatService {
    Seat holdSeat (Long seatId , Long userID);

    List<Seat> getAllSeats();
}
