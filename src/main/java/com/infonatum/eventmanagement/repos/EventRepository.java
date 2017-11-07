package com.infonatum.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.infonatum.eventmanagement.entities.Venue;

public interface EventRepository extends CrudRepository<Venue, Long>{

}
