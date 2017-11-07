package com.infonatum.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.infonatum.eventmanagement.entities.Participant;

public interface ParticipantRepository extends CrudRepository<Participant, Long>{

}
