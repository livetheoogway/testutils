package com.livetheoogway.commons.testutils;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ObjectExtractorTest {

    @Test
    void testObjectExtraction() throws IOException {
        Sample sample = new Sample("Kraftor", 21, "Somewhere nice", "WWE champion");
        ObjectExtractor objectExtractor = new ObjectExtractor();
        assertEquals(sample, objectExtractor.getObject("sample.json", Sample.class));
    }

    record Sample(String name, int age, String place, String title) {}
}