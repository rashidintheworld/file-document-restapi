package com.example.pdfbackend.util;

import com.example.pdfbackend.dto.DocumentFontColor;
import com.example.pdfbackend.dto.ElementFont;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

@UtilityClass
@Slf4j
public class FontUtil {
    public static Font formatFont(ElementFont elementFont) {
        log.debug("Setting font");
        DocumentFontColor fontColor = elementFont.getDocumentFontColor();
        BaseColor baseColor = new BaseColor(fontColor.getRed(), fontColor.getGreen(), fontColor.getBlue());

        return FontFactory.getFont(elementFont.getFontType(), elementFont.getFontSize(),  elementFont.getFontStyle(), baseColor);
    }
}