package com.design.pattern.behavioural.visitor;

public interface DocumentVisitor {
	public int visit(JsonDocument document);
	public int visit(XmlDocument document);
}
