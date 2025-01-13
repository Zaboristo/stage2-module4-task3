package com.mjc.stage2.parser;

import java.util.ArrayList;
import java.util.List;

public class ChainParserBuilder {
    private List<AbstractTextParser> parsers = new ArrayList<>();

    public ChainParserBuilder() {
    }

    public ChainParserBuilder setParser(AbstractTextParser parser) {
        parsers.add(parser);
        return this;
    }

    public AbstractTextParser build() {
        for (int i = 0; i < parsers.size() - 1; i++) {
            parsers.get(i).setNextParser(parsers.get(i + 1));
        }
        return parsers.isEmpty() ? null : parsers.get(0);
    }
}
