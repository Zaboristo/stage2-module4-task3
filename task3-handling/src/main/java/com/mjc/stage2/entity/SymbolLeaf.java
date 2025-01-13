package com.mjc.stage2.entity;

public class SymbolLeaf extends AbstractTextComponent {

    private final char value;

    public SymbolLeaf(char value) {
        super(TextComponentType.SYMBOL);
        this.value = value;
    }

    @Override
    public String operation() {
        return Character.toString(value);
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException("Cannot add to a leaf component.");
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException("Cannot remove from a leaf component.");
    }

    @Override
    public int getSize() {
        return 1;
    }
}
