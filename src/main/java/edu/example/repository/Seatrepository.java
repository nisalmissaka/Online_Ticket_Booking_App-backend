package edu.example.repository;

import edu.example.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Seatrepository extends JpaRepository<Long,Seat> {

}
