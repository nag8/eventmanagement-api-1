package com.infonatum.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.infonatum.eventmanagement.entities.Event;

public interface VenueRepository extends CrudRepository<Event, Long>{

}
