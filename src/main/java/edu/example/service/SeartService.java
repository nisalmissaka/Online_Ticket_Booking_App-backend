package edu.example.service;

import edu.example.entity.Seat;
import org.springframework.stereotype.Service;

@Service
public interface SeartService {
    Seat holdSeat (Long seatId , Long userID);
}
