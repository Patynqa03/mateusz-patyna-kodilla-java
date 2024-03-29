package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final String bun;
    private final String burgers;
    private final String sauce;
    private  List<String> ingredients = new ArrayList<>();

    public static class BigmacBuilder {

    private String bun;
    private String burgers;
    private String sauce;
    private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder Bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder Burgers(String burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder Sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder Ingredients(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    private Bigmac(final String bun, final String burgers, final String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public String getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers='" + burgers + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
