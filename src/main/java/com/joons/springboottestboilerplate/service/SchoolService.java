package com.joons.springboottestboilerplate.service;

import com.joons.springboottestboilerplate.domain.School;
import com.joons.springboottestboilerplate.repository.SchoolRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolService {

    private SchoolRepository schoolRepository;

    public SchoolService(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    public List<School> findAll() {
        return schoolRepository.findAll();
    }

    @Cacheable(value = "LocalCacheData", key = "#id")
    public School findById(Long id) {
        slowQuery(3000);
        Optional<School> school = schoolRepository.findById(id);
        return school.get();
    }

    public School save(School school) {
        return schoolRepository.save(school);
    }

    private void slowQuery(long seconds) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
