package com.pk.investing.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pk.investing.server.entity.DeltaOptionChainDataPriceBand;

@Repository
public interface DeltaOptionChainDataPriceBandRepository extends JpaRepository<DeltaOptionChainDataPriceBand, Integer>{

}
