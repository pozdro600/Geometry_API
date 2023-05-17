package com.eugeniusz.geometry_api.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = CircleCreateRequest.class, name = "CIRCLE"),
        @JsonSubTypes.Type(value = RectangleCreateRequest.class, name = "RECTANGLE"),
        @JsonSubTypes.Type(value = SquareCreateRequest.class, name = "SQUARE")
})
public abstract class ShapeCreateRequest {
    // common fields, if any
}

