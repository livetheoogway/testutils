package com.livetheoogway.commons.testutils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

class PerformanceEvaluatorTest {

    @Test
    void testPerfEval() {
        PerformanceEvaluator performanceEvaluator = new PerformanceEvaluator();
        AtomicInteger count = new AtomicInteger(0);
        performanceEvaluator.evaluate(100, count::incrementAndGet);
        Assertions.assertEquals(100, count.get());
        Assertions.assertEquals(100, performanceEvaluator.getTimer().getCount());
        Assertions.assertTrue(performanceEvaluator.getTimer().getSnapshot().get99thPercentile() > 0);
    }
}