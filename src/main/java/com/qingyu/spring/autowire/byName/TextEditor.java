package com.qingyu.spring.autowire.byName;

public class TextEditor {

    private SpellChecker spellChecker;
    private String name;

    public TextEditor(SpellChecker spellChecker ,  String name) {
        this.spellChecker = spellChecker;
        this.name = name;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TextEditor{" +
                "spellChecker=" + spellChecker +
                ", name='" + name + '\'' +
                '}';
    }
}
