package com.infonatum.eventmanagement.entities.projections;

import org.springframework.data.rest.core.config.Projection;

import com.infonatum.eventmanagement.entities.Participant;

@Projection(name="participantProjection",types= {Participant.class})
public interface PartialParticipantProjection {

	String getName();
	boolean getCheckedIn();
}
