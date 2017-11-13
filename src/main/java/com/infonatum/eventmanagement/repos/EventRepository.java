package com.infonatum.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.infonatum.eventmanagement.entities.Venue;

public interface EventRepository extends PagingAndSortingRepository<Venue, Long>{

}
