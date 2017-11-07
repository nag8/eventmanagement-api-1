package com.infonatum.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.infonatum.eventmanagement.entities.Event;

public interface OrganizerRepository extends CrudRepository<Event, Long>{

}
