package solid.i.problem;

public interface BearKeeper {
	
	// so here we know feeing and cleaning should be done by Keeper
	// but he doen't have to pet the bear - it not compulsory
	// so unneceesary method will be implemented by all the subclasses
	// this breaks Interface seggrgation
	
	//so we will split this into separate interface
	
	void feedBear();
	void cleanBear();
	void petBear();
}
