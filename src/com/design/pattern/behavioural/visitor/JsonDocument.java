package com.design.pattern.behavioural.visitor;

public class JsonDocument implements Document {

	@Override
	public void accept(DocumentVisitor visitor) {
		visitor.visit(this);
	}
}
