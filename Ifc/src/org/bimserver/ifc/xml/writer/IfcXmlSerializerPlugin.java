package org.bimserver.ifc.xml.writer;

import org.bimserver.plugins.serializers.EmfSerializer;
import org.bimserver.plugins.serializers.SerializerPlugin;

public class IfcXmlSerializerPlugin implements SerializerPlugin {

	@Override
	public EmfSerializer createSerializer() {
		return new IfcXmlSerializer();
	}

	@Override
	public String getDescription() {
		return "IfcXmlSerializerPlugin";
	}

	@Override
	public String getName() {
		return "IfcXmlSerializerPlugin";
	}

	@Override
	public String getVersion() {
		return "1.0";
	}

	@Override
	public void init() {
	}
}