package com.infonatum.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.infonatum.eventmanagement.entities.Participant;

public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long>{

}
