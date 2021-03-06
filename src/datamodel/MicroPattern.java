package datamodel;

import java.util.ArrayList;

public class MicroPattern extends PatternTest {
	PatternComponent leaf1;
	PatternComponent leaf2;
	PatternComponent leaf3;
	PatternComponent leaf4;
	private PatternComponent container;
	private ArrayList<PatternComponent> leafs = new ArrayList<PatternComponent>(4);
	
	public MicroPattern() {
		setContainer(new PatternComposite(PATTERN_NAME_MICRO));
		leaf1 = new PatternPart(PART_TITLE_NAME, "");
		leaf2 = new PatternPart(PART_TITLE_TEMPLATE, "");
		leaf3 = new PatternPart(PART_TITLE_PROBLEM, "");
		leaf4 = new PatternPart(PART_TITLE_SOLUTION, "");
		doAddCool();
	}
	
	public MicroPattern(MicroPattern microPattern) {
		this.setContainer(new PatternComposite(microPattern.getContainer().getTitle()));
		this.leaf1 = new PatternPart(microPattern.leaf1.getTitle(), microPattern.leaf1.getContents());
		this.leaf2 = new PatternPart(microPattern.leaf2.getTitle(), microPattern.leaf2.getContents());
		this.leaf3 = new PatternPart(microPattern.leaf3.getTitle(), microPattern.leaf3.getContents());
		this.leaf4 = new PatternPart(microPattern.leaf4.getTitle(), microPattern.leaf4.getContents());
		doAddCool();
	}
	
	public void doAddCool() {
		getContainer().add(getContainer());
		getContainer().add(leaf1);
		getContainer().add(leaf2);
		getContainer().add(leaf3);
		getContainer().add(leaf4);
	}
	
	@Override
	public PatternTest clone() {
		return new MicroPattern(this);
	}

	public PatternComponent getContainer() {
		return container;
	}

	public void setContainer(PatternComponent container) {
		this.container = container;
	}
	
	public PatternComponent getLeaf1() {
		return leaf1;
	}

	public PatternComponent getLeaf2() {
		return leaf2;
	}

	public PatternComponent getLeaf3() {
		return leaf3;
	}

	public PatternComponent getLeaf4() {
		return leaf4;
	}
}
