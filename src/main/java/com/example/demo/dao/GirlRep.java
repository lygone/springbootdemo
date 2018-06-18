package com.example.demo.dao;

import com.example.demo.some.Girl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * Created by panyi on 2018/5/27.
 */
@Component
public interface GirlRep extends JpaRepository<Girl,Integer> {

}
