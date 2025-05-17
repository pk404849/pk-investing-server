package com.pk.investing.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pk.investing.server.entity.DeltaOptionChainData;

@Repository
public interface DeltaOptionChainDataRepository extends JpaRepository<DeltaOptionChainData, Integer> {

}
