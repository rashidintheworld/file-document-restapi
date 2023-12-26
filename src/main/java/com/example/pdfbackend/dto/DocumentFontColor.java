package com.example.pdfbackend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DocumentFontColor {
    @Schema(defaultValue = "0", minimum = "0", maximum = "255")
    @JsonProperty(value = "Red")
    int red;
    @Schema(defaultValue = "0", minimum = "0", maximum = "255")
    @JsonProperty(value = "Green")
    int green;
    @Schema(defaultValue = "0", minimum = "0", maximum = "255")
    @JsonProperty(value = "Blue")
    int blue;
}
