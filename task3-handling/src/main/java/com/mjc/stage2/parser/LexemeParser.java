package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.TextComponent;
import com.mjc.stage2.entity.TextComponentType;

public class LexemeParser extends AbstractTextParser {
    private static final String LEXEME_REGEX = "\\s+";
    private static final String WORD_REGEX = "\\w[\\w!=?():]+";

    public LexemeParser(AbstractTextParser nextParser) {
        this.nextParser = nextParser;
    }

    @Override
    public void parse(AbstractTextComponent component, String sentence) {
        String[] lexemes = sentence.split(LEXEME_REGEX);
        for (String lexeme : lexemes) {
        AbstractTextComponent lexemeComponent = new TextComponent(TextComponentType.WORD);
            nextParser.parse(lexemeComponent, lexeme);
            component.add(lexemeComponent);
        }
    }

    // Write your code here!

}
