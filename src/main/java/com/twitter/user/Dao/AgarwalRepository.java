package com.twitter.user.Dao;

import com.twitter.user.Model.Parag;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;


@Repository
public interface AgarwalRepository extends JpaRepository<Parag, Integer> {

}
