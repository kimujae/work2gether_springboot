package com.kujproject.kuj.dto.board;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter(AccessLevel.PROTECTED)
public class UpdateBoardCoverDto {
    @Size(max = 7, message = "보드 커버는 7자를 초과할 수 없습니다.")
    @Pattern(regexp = "^#[0-9]{6}$")
    private String cover;
}
