package com.example.jpapersistcontext.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.ZonedDateTime;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class TestEntity {

    @Id
    @GeneratedValue
    private Long seq;

    private int num;

    private ZonedDateTime zonedDateTime;
}
