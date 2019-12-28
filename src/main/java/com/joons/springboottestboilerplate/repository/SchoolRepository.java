package com.joons.springboottestboilerplate.repository;

import com.joons.springboottestboilerplate.domain.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Long> {
}
