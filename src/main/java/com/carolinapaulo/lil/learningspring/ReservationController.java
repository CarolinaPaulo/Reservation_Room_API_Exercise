package com.carolinapaulo.lil.learningspring;

import com.carolinapaulo.lil.learningspring.data.entity.Reservation;
import com.carolinapaulo.lil.learningspring.data.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservationsA")
public class ReservationController {
    @Autowired
    private ReservationRepository reservationRepository;

    @GetMapping
    public Iterable<Reservation> getRooms() {
        return this.reservationRepository.findAll();
    }

}
