package com.deliverboy.deliverboy.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deliverboy.deliverboy.domain.entities.Motoboy;


@Repository
public interface MotoboyRepository extends JpaRepository<Motoboy, Long> {
	

}
