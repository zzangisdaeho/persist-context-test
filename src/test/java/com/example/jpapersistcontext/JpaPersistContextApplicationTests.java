package com.example.jpapersistcontext;

import com.example.jpapersistcontext.entity.TestEntity;
import com.example.jpapersistcontext.repository.TestEntityRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.ZonedDateTime;
import java.util.List;

@SpringBootTest
class JpaPersistContextApplicationTests {

    @Autowired
    private TestEntityRepository testEntityRepository;

    @Test
//    @Transactional
    void contextLoads() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now().minusDays(5);


        List<TestEntity> list5 = testEntityRepository.findAllByZonedDateTimeAfter(zonedDateTime);
//        List<TestEntity> listAll1 = testEntityRepository.findAllByZonedDateTimeAfter(zonedDateTime);
//
        TestEntity testEntity = list5.get(0);
        testEntity.setNum(500);
//        List<TestEntity> listAll2 = testEntityRepository.findAllByZonedDateTimeAfter(zonedDateTime);

        List<TestEntity> list3 = testEntityRepository.findAllByZonedDateTimeAfter(ZonedDateTime.now().minusDays(3));

        System.out.println("list3 = " + list3);

    }

}
