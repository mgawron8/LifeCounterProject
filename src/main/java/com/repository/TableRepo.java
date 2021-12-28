package com.repository;

import com.mtgApp.LifeCounter.entity.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepo extends JpaRepository<Table, Long> {

}
