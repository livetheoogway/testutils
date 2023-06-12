package com.livetheoogway.commons.testutils;

import com.fasterxml.jackson.core.type.TypeReference;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

import static lombok.Lombok.checkNotNull;

public class ObjectExtractor {

    private static String read(InputStream source) throws IOException {
        return read(new InputStreamReader(source, StandardCharsets.UTF_8));
    }

    private static String read(Reader source) throws IOException {
        return read(new BufferedReader(source));
    }

    private static String read(BufferedReader source) throws IOException {
        checkNotNull(source, "The input is required.");
        try (source) {
            int read = source.read();
            StringBuilder script;
            for (script = new StringBuilder(); read != -1; read = source.read()) {
                script.append((char) read);
            }
            return script.toString();
        }
    }

    public <T> T getObject(String resource, Class<T> clazz) throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        String read = read(classLoader.getResourceAsStream(resource));
        return Mapper.MAPPER.readValue(read, clazz);
    }

    public <T> T getObject(String resource, TypeReference<T> typeReference) throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        String read = read(classLoader.getResourceAsStream(resource));
        return Mapper.MAPPER.readValue(read, typeReference);
    }
}
