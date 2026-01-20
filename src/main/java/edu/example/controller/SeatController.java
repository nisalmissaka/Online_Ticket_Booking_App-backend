package edu.example.controller;

import edu.example.model.Seat;
import edu.example.service.SeatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/seat")
@RequiredArgsConstructor
@CrossOrigin
public class SeatController {
    private final SeatService seatService;

    @GetMapping
    public List<Seat> getAllSeats(){
        return seatService.getAllSeats();
    }
    @GetMapping("/{id}")
    public Seat getSeatById(@PathVariable Long id){
        return seatService.getSeatById(id);


    }
}
