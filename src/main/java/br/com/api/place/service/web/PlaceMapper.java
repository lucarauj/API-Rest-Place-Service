package br.com.api.place.service.web;

import br.com.api.place.service.api.PlaceResponse;
import br.com.api.place.service.domain.Place;

public class PlaceMapper {
    public static PlaceResponse fromPlaceToResponse(Place place) {
        return new PlaceResponse(place.name(), place.slug(), place.state(), place.createdAt(), place.updatedAt());
    }
}
