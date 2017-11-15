package com.infonatum.eventmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.infonatum.eventmanagement.controllers.exceptions.AlreadyCheckedInException;
import com.infonatum.eventmanagement.controllers.exceptions.NotCheckedInException;
import com.infonatum.eventmanagement.entities.Participant;
import com.infonatum.eventmanagement.repos.ParticipantRepository;

@RepositoryRestController
@RequestMapping("/events")
public class CheckinController {

	@Autowired
	ParticipantRepository participantRepository;
	
	@PostMapping("/checkin/{id}")
	public ResponseEntity<PersistentEntityResource> checkIn(@PathVariable Long id, PersistentEntityResourceAssembler assembler){
		Participant participant = participantRepository.findOne(id);
		
		if(participant != null) {
			if(participant.getCheckedIn()) {
				throw new AlreadyCheckedInException();
			}
		}
		
		participant.setCheckedIn(true);

		participantRepository.save(participant);
		
		return ResponseEntity.ok(assembler.toResource(participant));
		
	}
	
	
	@PostMapping("/checkout/{id}")
	public ResponseEntity<PersistentEntityResource> checkOut(@PathVariable Long id, PersistentEntityResourceAssembler assembler){
		Participant participant = participantRepository.findOne(id);
		
		if(participant != null) {
			if(!participant.getCheckedIn()) {
				throw new NotCheckedInException();
			}
		}

		participant.setCheckedIn(false);

		participantRepository.save(participant);
		
		return ResponseEntity.ok(assembler.toResource(participant));
		
	}
}
