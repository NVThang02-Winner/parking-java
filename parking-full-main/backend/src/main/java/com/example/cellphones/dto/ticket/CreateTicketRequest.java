package com.example.cellphones.dto.ticket;

import com.example.cellphones.dto.request.vehicle.CreateVehicleRequest;
import com.example.cellphones.model.parking.TicketType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CreateTicketRequest {
    private Long customerId;

    private Long parkingSpaceId;

    private Long vehicleId;

    private CreateVehicleRequest vehicleRequest;

    private int numberTimeRent;

    private String expiryDate;

    private TicketType ticketType;
}
