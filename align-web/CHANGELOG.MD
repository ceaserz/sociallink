Version 2.0
---------------------

 - completely rebuilt alignments from scratch taking entities from 128 chapters of DBpedia
 - added the ability to work with a custom user index
 - performance and reliability improvements


Version 0.6-beta
---------------------

 - Added new entities, improved filtering on dead entities (net gain +34713 entities)
 - Our alignments now preserve a 1-1 relation, meaning that no twitter profile will be aligned to multiple entities.
 Algorithm now selects the most probable alignment across N-1 matches based on the score. This behaviour will change in 
 future, once we figure out a better way to align multiple entities to the same Twitter ID.