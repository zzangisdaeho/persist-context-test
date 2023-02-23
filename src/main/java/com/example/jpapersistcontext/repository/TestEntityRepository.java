package com.example.jpapersistcontext.repository;

import com.example.jpapersistcontext.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.ZonedDateTime;
import java.util.List;

public interface TestEntityRepository extends JpaRepository<TestEntity, Long> {

    List<TestEntity> findAllByZonedDateTimeAfter(ZonedDateTime time);
}
