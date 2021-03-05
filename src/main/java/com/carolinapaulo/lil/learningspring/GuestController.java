package com.carolinapaulo.lil.learningspring;

import com.carolinapaulo.lil.learningspring.data.entity.Guest;
import com.carolinapaulo.lil.learningspring.data.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guests")
public class GuestController {
    @Autowired
    private GuestRepository guestRepository;

    @GetMapping
    public Iterable<Guest> getGuests() {
        return this.guestRepository.findAll();
    }

}
