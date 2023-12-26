package com.example.pdfbackend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class CreateDocumentRequest {
    @Schema(description = "Name pdf document", example = "memarliq-inshaat-it", required = true)
    @JsonProperty("DocumentName")
    private String documentName;

    @JsonProperty("Content")
    List<DocumentContent> documentContentList;
}
