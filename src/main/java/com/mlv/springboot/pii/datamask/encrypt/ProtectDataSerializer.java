package com.mlv.springboot.pii.datamask.encrypt;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class ProtectDataSerializer extends JsonSerializer {

	@Override
	public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {

		String pii = value.toString().replaceAll("\\w(?=\\w{4})", "X");
		gen.writeString(pii);

	}

}
