package projekat.demo.service;

import projekat.demo.dto.ArenaDto;
import projekat.demo.model.Arena;
import projekat.demo.model.Place;

public interface ArenaService {

	Iterable<Arena> findAllArenas();

	Arena createArena(ArenaDto arenaDto);

	Arena updateArena(Long arenaId, ArenaDto arenaDto);

	void deleteArena(Long arenaId);

	Iterable<Arena> findArenaByPlace(Place place);
	
	Arena findArenaById(long id);
	
	Arena findArenaByNameAndPlace(String name, Place place);

}
