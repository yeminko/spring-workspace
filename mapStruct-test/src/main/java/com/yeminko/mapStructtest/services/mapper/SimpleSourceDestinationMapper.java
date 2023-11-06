package com.yeminko.mapStructtest.services.mapper;

import com.yeminko.mapStructtest.models.simple.SimpleDestination;
import com.yeminko.mapStructtest.models.simple.SimpleSource;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SimpleSourceDestinationMapper {
    SimpleDestination sourceToDestination(SimpleSource source);
    SimpleSource destinationToSource(SimpleDestination destination);
}