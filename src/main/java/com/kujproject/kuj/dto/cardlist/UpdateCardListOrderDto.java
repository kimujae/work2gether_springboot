package com.kujproject.kuj.dto.cardlist;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateCardListOrderDto {
    @NotEmpty
    private int cardlistOrder;
}
