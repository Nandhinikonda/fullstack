package com.aits.mobileprepaidservices.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aits.mobileprepaidservices.entity.RechargeHistory;

public interface RechargeHistoryRepository extends JpaRepository<RechargeHistory, Long> {
	
	List<RechargeHistory> findByUser_Id(long userId);

}