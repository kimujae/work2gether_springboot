package com.kujproject.kuj.dto.todo_check;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CreateCheck {
    String title;
    LocalDate duedate;
    boolean isCompleted;
}
