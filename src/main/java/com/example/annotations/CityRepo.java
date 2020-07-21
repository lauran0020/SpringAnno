package com.example.annotations;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;


@Repository
    public interface CityRepo extends JpaRepository<City, Long> {

    }
    
