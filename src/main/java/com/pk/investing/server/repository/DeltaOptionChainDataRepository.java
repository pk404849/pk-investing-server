package com.pk.investing.server.repository;

//import java.time.LocalDateTime;
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import com.pk.investing.server.entity.DeltaOptionChainData;
//
//@Repository
//public interface DeltaOptionChainDataRepository extends JpaRepository<DeltaOptionChainData, Integer> {
//
//	@Query("SELECT delta* FROM DeltaOptionChainData delta WHERE delta.createdTime:=localDateTime")
//	public List<DeltaOptionChainData> findByCreatedTime(@Param("localDateTime") LocalDateTime localDateTime);
//
//}
