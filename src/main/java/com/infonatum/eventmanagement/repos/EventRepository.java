package com.infonatum.eventmanagement.repos;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.infonatum.eventmanagement.entities.Event;

public interface EventRepository extends PagingAndSortingRepository<Event, Long>{
	List<Event> findByName(@Param("name") String name);
}
