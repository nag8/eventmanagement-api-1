package com.infonatum.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.infonatum.eventmanagement.entities.Organizer;

public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long>{

}
