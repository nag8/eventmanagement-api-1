package com.infonatum.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.infonatum.eventmanagement.entities.Event;

public interface EventRepository extends PagingAndSortingRepository<Event, Long>{

}
