package com.example.pdfbackend.controller;

import com.example.pdfbackend.dto.CreateDocumentRequest;
import com.example.pdfbackend.sevice.DocumentService;
import com.itextpdf.text.DocumentException;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1/documents")
@Slf4j
@RequiredArgsConstructor
public class DocController {
    private final DocumentService documentService;
    @Operation(summary = "Create a PDF Document")
    @PostMapping("/pdf")
    @ResponseStatus(HttpStatus.CREATED)
    public void generateDocument(@RequestBody CreateDocumentRequest createDocumentRequest) throws DocumentException, IOException {
        log.info("Received request: {}", createDocumentRequest);
        documentService.generatePDF(createDocumentRequest);
    }
}
