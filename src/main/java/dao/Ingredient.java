package dao;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * taco 配料类
 * @author willchu
 */
@Data
@RequiredArgsConstructor
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
