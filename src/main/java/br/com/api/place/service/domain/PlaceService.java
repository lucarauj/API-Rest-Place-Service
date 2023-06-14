package br.com.api.place.service.domain;

import br.com.api.place.service.api.PlaceRequest;
import com.github.slugify.Slugify;
import reactor.core.publisher.Mono;

public class PlaceService {
    private PlaceRepository placeRepository;
    private Slugify slg;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
        this.slg = Slugify.builder().build();
    }

    public Mono<Place> create(PlaceRequest request) {
        var place = new Place(null, request.name(), slg.slugify(request.name()), request.state(), null, null);
        return placeRepository.save(place);
    }
}
