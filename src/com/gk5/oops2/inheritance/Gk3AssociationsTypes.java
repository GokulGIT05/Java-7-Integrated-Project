package com.gk5.oops2.inheritance;

public class Gk3AssociationsTypes {

	public static void main(String[] args) {
		// Associations are talks about Relation.
		// Association Demo
		AggregationContained demoObj = new AggregationContained();
		AssociationDemo assocaition = new AssociationDemo();
		assocaition.getAssociation(demoObj);
		// Except instance variable creation, it is same like aggregation.
		System.out.println("************************************************");
		
		// 1. Aggregation - Has - A Relation (Week Association)
		AggregationContained aggregation = new AggregationContained();
		AggregationContainer container = new AggregationContainer(aggregation);
		System.out.println(container.containedObj.test);
		container = null; // Destroying container
		System.out.println("Container Object is destroyed: " + container);
		System.out.println("Contained Object is still alive: " + aggregation);
		System.out.println("************************************************");

		// 2. Composition Relation ( Strong Association) (Part Of - Relation)
		CompositionContainer compositionContainer = new CompositionContainer();
		// To Call name in CompositionContained, we need object of CompositionContainer.
		System.out.println("Composition Demo: " + compositionContainer.compositionContained.name);
		compositionContainer = null; // Destroying container
		System.out.println("Trying to Call contained Object: " + compositionContainer.compositionContained); // Null Pointer Exception
		System.out.println("************************************************");

	}
}

// 1. Aggregation
class AggregationContainer {

	public AggregationContained containedObj = null;

	public AggregationContainer(AggregationContained containedObj) {
		super();
		this.containedObj = containedObj;
	}

}

class AggregationContained {
	String test = "Contained Object";
}

// 2. Composition:
class CompositionContainer {

	public CompositionContained compositionContained = new CompositionContained();

}

class CompositionContained {

	String name = "Gokul";

}

// 3. Association Simple Demo
class AssociationDemo {

	public void getAssociation(AggregationContained aggregationContained) {
		if (aggregationContained != null)
			System.out.println("This is Association");
	}
}
