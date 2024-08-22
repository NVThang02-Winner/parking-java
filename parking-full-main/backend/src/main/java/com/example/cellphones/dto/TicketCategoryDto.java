package com.example.cellphones.dto;

import com.example.cellphones.model.parking.TicketType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TicketCategoryDto {
    private TicketType ticketType;
    private Long count;
}
