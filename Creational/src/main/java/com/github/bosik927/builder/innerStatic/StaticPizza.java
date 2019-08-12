package com.github.bosik927.builder.innerStatic;

public class StaticPizza {

    private final String dough;
    private final String sauce;
    private final String topping;

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public String getTopping() {
        return topping;
    }

    @Override
    public String toString() {
        return "StaticPizza{" +
                "dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", topping='" + topping + '\'' +
                '}';
    }

    private StaticPizza(Builder builder) {
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.topping = builder.topping;
    }

    public static class Builder {

        private String dough;
        private String sauce;
        private String topping;

        public Builder withDough(String dough) {
            this.dough = dough;
            return this;
        }

        public Builder withSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder withTopping(String topping) {
            this.topping = topping;
            return this;
        }

        public StaticPizza build() {
            return new StaticPizza(this);
        }
    }
}