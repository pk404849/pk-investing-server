package com.pk.investing.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pk.investing.server.entity.DeltaOptionChainDataQuotes;

public interface DeltaOptionChainDataQuotesRepository extends JpaRepository<DeltaOptionChainDataQuotes, Integer> {

}
