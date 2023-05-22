package com.eugeniusz.geometry_api.service;

import com.eugeniusz.geometry_api.api.ShapePageRequest;
import com.eugeniusz.geometry_api.api.exceptions.ShapeNotFoundException;
import com.eugeniusz.geometry_api.dto.ShapeCreateRequest;
import com.eugeniusz.geometry_api.factory.ShapeCreator;
import com.eugeniusz.geometry_api.factory.ShapeFactory;
import com.eugeniusz.geometry_api.model.shape.Shape;
import com.eugeniusz.geometry_api.repository.ShapeRepository;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = lombok.AccessLevel.PRIVATE)
public class ShapeService {

    ShapeRepository repository;

    public Shape save(ShapeCreateRequest request) {
        return repository.save(ShapeFactory.createShape(request));
    }

    public Page<Shape> getAllBy(ShapePageRequest request) {
        return null;
    }

    public void deleteById(Long id) throws ShapeNotFoundException {
        if(!repository.existsById(id))
            throw new ShapeNotFoundException(id);
        repository.deleteById(id);
    }
}
