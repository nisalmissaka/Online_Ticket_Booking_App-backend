package edu.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "seats")
public class Seat {
    @Id
    @GeneratedValue
    private Long id;
    private String SeatNumber;
    private Long heldByUserId;
    private int version;
    private LocalDateTime holdExpiryTimestamp;

}
