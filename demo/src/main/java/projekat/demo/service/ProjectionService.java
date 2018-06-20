package projekat.demo.service;

import projekat.demo.model.Arena;
import projekat.demo.model.Projection;
import projekat.demo.model.Term;

public interface ProjectionService {

	Projection createProjection(Projection p);
	
	Projection updateProjection(Projection p);
	
	boolean deleteProjection(Projection p);
	
	Iterable<Projection> findAll();

	Iterable<Projection> findAllByPlaceId(long id);

	Iterable<Term> findTermByProjectionId(long id);

	Term findTermById(long id);
	
	Arena findArenaByTermId(long id);
	
	Iterable<Term> findTermByArenaId(long id);
	
	Term createTerm(Term t);

}
