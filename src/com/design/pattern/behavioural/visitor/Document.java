package com.design.pattern.behavioural.visitor;

public interface Document {
	public void accept(DocumentVisitor visitor);
}
