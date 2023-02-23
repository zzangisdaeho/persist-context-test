package com.example.jpapersistcontext.init;

import com.example.jpapersistcontext.entity.TestEntity;
import com.example.jpapersistcontext.repository.TestEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;
import java.util.List;

@Component
@RequiredArgsConstructor
public class InitData {

    private final TestEntityRepository testEntityRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void initData(){
        TestEntity t1 = TestEntity.builder().num(1).zonedDateTime(ZonedDateTime.now().minusDays(1)).build();
        TestEntity t2 = TestEntity.builder().num(1).zonedDateTime(ZonedDateTime.now().minusDays(2)).build();
        TestEntity t3 = TestEntity.builder().num(1).zonedDateTime(ZonedDateTime.now().minusDays(3)).build();
        TestEntity t4 = TestEntity.builder().num(1).zonedDateTime(ZonedDateTime.now().minusDays(4)).build();
        TestEntity t5 = TestEntity.builder().num(1).zonedDateTime(ZonedDateTime.now().minusDays(5)).build();

        testEntityRepository.saveAll(List.of(t1, t2, t3, t4, t5));
    }
}
