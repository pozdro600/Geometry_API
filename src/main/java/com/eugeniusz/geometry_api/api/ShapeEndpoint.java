package com.eugeniusz.geometry_api.api;

import com.eugeniusz.geometry_api.dto.ShapeDTO;
import com.eugeniusz.geometry_api.service.ShapeService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/*
Request do dodawania figur ma wygladac tak: @POST /api/v1/shapes body: { type: "NAZWA", parameters: [p1, p2 p3] } np dla kwadratu:
{ "type": "SQUARE", parameters: [10.0]} stworzc ma kwadarat o boku 10

response: (dla tego przykladu) 201 created, body: { "id", "type", "width", "version", "createdBy", "createdAt",
"lastModifiedAt", "lastModifiedBy", "area", "perimeter" }

endpoint ma byc dostepny tylko dla zalogowanych uzytkwonikow z rola CREATOR

drugi endpoint: @GET /api/v1/shapes?parameters... gdzie parameters to np: ?createdBy=...&type=...
&areaFrom=...&areaTo...&perimeterFrom=...&perimeterTo=...&widthFrom=...&widthTo=...&radiusFrom=...&radiusTo=... generalnie mozeby wyszukiwac po:

typie figury
pole od, pole do
obwod od, obwod do
data stworzenia od, do
kto stworzyl,
po parametrach figur, od - do
 */
@RestController("api/v1/shapes")
@RequiredArgsConstructor
public class ShapeEndpoint {

    private final ShapeService shapeService;

    @Operation(summary = "Retrieve shape by id")
    @GetMapping
    ShapeDTO getShapeById(Long id) {
        return shapeService.getShapeById(id);
    }
}
